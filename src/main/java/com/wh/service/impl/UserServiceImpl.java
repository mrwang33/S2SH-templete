package com.wh.service.impl;

import com.wh.dao.UserDAO;
import com.wh.entity.Phone;
import com.wh.entity.User;
import com.wh.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by wang1 on 2017/8/2.
 */
@Service("userService")
@Transactional()
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    public void createUser() {
        User user = new User("wang", "wang", null);
        Serializable save = userDAO.save(user);
        user.setId((String) save);
        Phone phone =new Phone("apple","iphone",user);
    }

    public Serializable save(User user) {
        Serializable save = userDAO.save(user);
        return save;
    }

    public List<User> getAll() {
        return userDAO.getAll();
    }
}
