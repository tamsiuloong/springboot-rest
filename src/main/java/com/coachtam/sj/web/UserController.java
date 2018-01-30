package com.coachtam.sj.web;

import com.coachtam.sj.entity.User;
import com.coachtam.sj.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author coach tam
 * @date 2018/1/6
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/user",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    @RequiresPermissions("user:list")
    public Page<User> list(Integer page,Integer size){

        Page<User> result = userService.findPage(new PageRequest(page==null?0:page-1,size==null?2:size,new Sort("id")));
        return result;
    }

    @RequiresPermissions("user:delete")
    @RequestMapping(value="/user/{id}",method = RequestMethod.DELETE)
    public Boolean delete(@PathVariable Integer id){
        return userService.delete(id);
    }

    @RequestMapping(value="/user",method = {RequestMethod.PUT,RequestMethod.POST})
    public Boolean update(@RequestBody User user){
        return userService.update(user);
    }
}
