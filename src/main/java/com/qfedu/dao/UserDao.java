package com.qfedu.dao;

import com.qfedu.entity.User;

public interface UserDao {
    User findName(String username);
}
