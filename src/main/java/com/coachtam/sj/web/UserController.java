package com.coachtam.sj.web;

import com.coachtam.sj.entity.User;
import com.coachtam.sj.service.UserService;
import com.coachtam.sj.utils.Pagination;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import javax.annotation.Resource;

/**
 * @author coach tam
 * @date 2018/1/6
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<User> list(Integer page,Integer size){

        Page<User> result = userService.findPage(new PageRequest(page==null?0:page-1,size==null?2:size,new Sort("id")));
        return result;
    }
}
