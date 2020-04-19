package com.tian.springboot_jpademo.dao;

import com.tian.springboot_jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author tian
 * @DateTime 2020/4/19 13:23
 */
public interface UserDao extends JpaRepository<User,Integer> {

   User findByUsernameAndPassword(String name,String password);
}
