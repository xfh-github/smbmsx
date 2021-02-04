package com.xing.service.user;

import com.xing.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode,String password);
}
