package com.coachtam.sj.dao;

import com.coachtam.sj.entity.User;
import com.coachtam.sj.utils.Pagination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author coach tam
 * @date 2018/1/6
 */
public interface UserDao extends PagingAndSortingRepository<User, Integer> {

}
