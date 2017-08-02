package com.wh.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by wang1 on 2017/8/2.
 */
@Entity
@Table(name = "phone")
public class Phone implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //手机品牌
    private String brand;
    //手机型号
    private String model;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Phone() {
    }

    public Phone(String brand, String model, User user) {
        this.brand = brand;
        this.model = model;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
