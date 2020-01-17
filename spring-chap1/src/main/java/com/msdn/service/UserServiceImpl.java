package com.msdn.service;

import com.msdn.dao.UserDao;
import com.msdn.dao.UserDaoImpl;

/**
 * @author hresh
 * @date 2019/12/17 17:10
 * @description
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
