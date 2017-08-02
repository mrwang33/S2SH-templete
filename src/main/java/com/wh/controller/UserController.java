package com.wh.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.wh.dao.UserDAO;
import com.wh.entity.User;
import com.wh.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wang1 on 2017/8/1.
 */
@Controller("userController")
public class UserController extends ActionSupport {
    @Resource
    private UserDAO userDAO;
    @Resource
    private UserService userService;


    private User user;

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAll() {
        users = userDAO.getAll();
        return this.SUCCESS;
    }

    public String goAddUser() {
        return "add";
    }

    public String addUser() {
        userDAO.save(user);
        return SUCCESS;
    }

    public String createUser() {
        userService.createUser();
        return SUCCESS;
    }

}
