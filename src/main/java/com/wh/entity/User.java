package com.wh.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by wang1 on 2017/8/1.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

    private Integer id;
    private String username;
    private String password;
    public User() {
    }
    public User(Integer id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


}
