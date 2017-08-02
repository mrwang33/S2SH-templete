package com.wh.dao;

import com.wh.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wang1 on 2017/8/1.
 */
public interface UserDAO {
    int save(User user);
    List<User> getAll();
}
