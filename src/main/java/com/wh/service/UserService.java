package com.wh.service;

import com.wh.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wang1 on 2017/8/2.
 */
public interface UserService {
    void createUser();

    /**
     * 保存用户
     * @param user
     * @return 数据主键值
     */
    Serializable save(User user);
    List<User> getAll();
}
