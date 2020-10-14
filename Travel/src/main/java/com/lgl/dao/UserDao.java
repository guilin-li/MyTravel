package com.lgl.dao;

import com.lgl.domain.User;

public interface UserDao {

    User findByName(String name);

}
