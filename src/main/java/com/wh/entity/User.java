package com.wh.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by wang1 on 2017/8/1.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Phone> phoneSet;

    public User() {
    }

    public User(String username, String password, List<Phone> phoneSet) {
        this.username = username;
        this.password = password;
        this.phoneSet = phoneSet;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Phone> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(List<Phone> phoneSet) {
        this.phoneSet = phoneSet;
    }
}
