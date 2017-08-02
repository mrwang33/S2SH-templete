package com.wh.dao.impl;

import com.wh.dao.UserDAO;
import com.wh.entity.User;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.io.Serializable;
import java.util.List;

/**
 * Created by wang1 on 2017/8/1.
 */
@Component("userDAO")
public class UserDAOImpl implements UserDAO {
    @Resource
    private HibernateTemplate hibernateTemplate;

    public int save(User user) {
        Serializable save = hibernateTemplate.save(user);
        return (Integer)save;
    }

    public List<User> getAll() {
        return (List<User>) hibernateTemplate.find("FROM User u");
    }
}
