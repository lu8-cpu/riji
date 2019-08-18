package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String username,String password) {
        User u = userDao.findName(username);
        if (null == u){
            throw new RuntimeException("账号错误");
        }
        if (!u.getPassword().equals(password)) {
            throw new RuntimeException("密码错误");
        }
        return u;

    }
}
