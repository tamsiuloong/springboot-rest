package com.coachtam.sj.service;

import com.coachtam.sj.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author coach tam
 * @date 2018/1/6
 */
public interface UserService {
    void save(User user);

    Page<User> findPage(PageRequest page);

    Boolean delete(Integer id);

    Boolean update(User user);
}
