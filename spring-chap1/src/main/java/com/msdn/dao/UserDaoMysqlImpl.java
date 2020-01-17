package com.msdn.dao;

import com.msdn.bean.User;

/**
 * @author hresh
 * @date 2019/12/17 17:16
 * @description
 */
public class UserDaoMysqlImpl implements UserDao {
    public void getUser() {
        User user = new User("acorn");
        System.out.println("从MySQL数据库中获取到的用户数据为"+user);
//        System.out.println("从MySQL数据库中获取到的用户数据为");
    }
}
