package com.wh.service.impl;

import com.wh.dao.UserDAO;
import com.wh.entity.User;
import com.wh.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wang1 on 2017/8/2.
 */
@Service("userService")
@Transactional()
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    public void createUser() {
        userDAO.save(new User(null,"weitian","weitian"));
        userDAO.save(new User(1,"mrquin","mrquin"));
        int i = 2/0;
    }
}
