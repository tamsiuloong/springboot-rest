package com.coachtam.sj.service;

import com.coachtam.sj.dao.UserDao;
import com.coachtam.sj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author coach tam
 * @date 2018/1/6
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


//    @Autowired
//    private JpaRepository<User,Integer> dao;
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public Page<User> findPage(PageRequest page) {
        return userDao.findAll(page);
    }
}
