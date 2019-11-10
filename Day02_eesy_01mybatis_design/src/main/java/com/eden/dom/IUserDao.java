package com.eden.dom;

import com.eden.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
