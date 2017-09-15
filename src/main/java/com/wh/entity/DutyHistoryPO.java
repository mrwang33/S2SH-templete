package com.wh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by wang1 on 2017/8/30.
 */
@Entity
@Table(name = "wgs_dutyhistory")
public class DutyHistoryPO implements Serializable {
    private static final long serialVersionUID = 1028708274L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    private Date duty_date;
    private Integer period;
    private Integer main_sec;
    private String description;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDuty_date() {
        return duty_date;
    }

    public void setDuty_date(Date duty_date) {
        this.duty_date = duty_date;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getMain_sec() {
        return main_sec;
    }

    public void setMain_sec(Integer main_sec) {
        this.main_sec = main_sec;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
