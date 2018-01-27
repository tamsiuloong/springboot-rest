package com.coachtam.sj.web;

import com.alibaba.fastjson.JSONObject;
import com.coachtam.sj.entity.ResultVO;
import com.coachtam.sj.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/1/27.
 */
@RestController
@RequestMapping("/api/v1")
public class LoginController {
    /**
     * 登录方法
     * @param user
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public ResultVO ajaxLogin(@RequestBody User user) {
        ResultVO resultVO = new ResultVO();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(token);
            resultVO.setToken(subject.getSession().getId().toString());
            resultVO.setData(subject.getPrincipal());

        } catch (IncorrectCredentialsException e) {
            resultVO.setMsg("密码错误");
        } catch (LockedAccountException e) {
            resultVO.setMsg("登录失败，该用户已被冻结");
        } catch (AuthenticationException e) {
            resultVO.setMsg("该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultVO;
    }
}
