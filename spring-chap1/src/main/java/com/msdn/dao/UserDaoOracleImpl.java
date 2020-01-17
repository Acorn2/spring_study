package com.msdn.dao;

import com.msdn.bean.User;

/**
 * @author hresh
 * @date 2019/12/17 17:17
 * @description
 */
public class UserDaoOracleImpl implements UserDao {
    public void getUser() {
        User user = new User("clearLove");
        System.out.println("从Oracle数据库中获取到的用户数据为"+user);
//        System.out.println("从Oracle数据库中获取到的用户数据为");
    }
}
