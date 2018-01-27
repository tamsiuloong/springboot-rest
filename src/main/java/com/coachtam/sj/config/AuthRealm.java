package com.coachtam.sj.config;


import com.coachtam.sj.entity.User;
import com.coachtam.sj.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * @author coach tam
 * @date 2017/12/22
 */
public class AuthRealm extends AuthorizingRealm {


    @Autowired
    private UserService userService;
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo result = new SimpleAuthorizationInfo();

        User user = (User) principalCollection.getPrimaryPrincipal();
        //循环遍历所有角色中的所有模块（权限）,加入到result中
//        for (Role role : user.getRoleSet()) {
//            role.getModuleSet().forEach(module -> result.addStringPermission(module.getCpermission()));
//        }
        return result;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //authenticationToken 父 --> UsernamePasswordToken 子
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //1,获取表单用户数据
        String username = token.getUsername();


        //2,获取数据库用户数据
        User user = userService.findByUsername(username);
//        //为了避免no session异常，将需要延迟加载的数据，马上加载出来
//        user.getDept().getDeptName();
//        user.getUserInfo().getName();
//
////        user.getRoleSet().forEach(role->role.getName());
//        for (Role role : user.getRoleSet()) {
//            role.getModuleSet().forEach(module -> module.getName());
//        }



        SimpleAuthenticationInfo result = new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());

        return result;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
