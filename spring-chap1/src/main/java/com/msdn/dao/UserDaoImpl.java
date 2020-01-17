package com.msdn.dao;

import com.msdn.bean.User;

/**
 * @author hresh
 * @date 2019/12/17 17:07
 * @description
 */
public class UserDaoImpl implements UserDao {
    public void getUser() {
        User user = new User("hresh");
        System.out.println("从bean中获取到的用户数据为"+user);
//        System.out.println("从bean中获取到的用户数据为");
    }
}
