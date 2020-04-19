package com.tian.springboot_jpademo;


import com.tian.springboot_jpademo.dao.UserDao;
import com.tian.springboot_jpademo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootJpademoApplicationTests {

    @Autowired
    private UserDao ud;

    /**
     *
     */
    @Test
    void contextLoads() {
//        User user = ud.findByUsernameAndPassword("donghao", "123");
//        System.out.println(user.getInfo());
        User user = ud.getOne(1);
        System.out.println(user.getInfo());
    }

    /**
     *
     * @param name
     * @param password
     */
    void  getFind(String name,String password){

    }
}
