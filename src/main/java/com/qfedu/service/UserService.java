package com.qfedu.service;

import com.qfedu.entity.User;

public interface UserService {
    User findUserByName(String username,String password);
}
