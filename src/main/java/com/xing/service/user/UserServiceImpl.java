package com.xing.service.user;

import com.xing.dao.BaseDao;
import com.xing.dao.user.UserDao;
import com.xing.dao.user.UserDaoImpl;
import com.xing.pojo.User;

import java.sql.Connection;

public class UserServiceImpl implements UserService{

    //业务层都会调用dao层，所以我们要引入dao层
    private UserDao userDao;
    private UserServiceImpl(){
        userDao = new UserDaoImpl();
    }

    public User login(String userCode, String password) {
        Connection connection=null;
        User user=null;

        Connection connection = BaseDao.getConnection();
        return null;
    }
}
