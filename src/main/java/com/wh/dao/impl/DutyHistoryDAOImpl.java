package com.wh.dao.impl;

import com.wh.dao.DutyHistoryDAO;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wang1 on 2017/8/30.
 */
@Repository("dutyHistory")
public class DutyHistoryDAOImpl implements DutyHistoryDAO {
    @Resource
    private HibernateTemplate hibernateTemplate;
    public String getByDate() {
        List<String> objects = (List<String>) hibernateTemplate.find("select po.description from com.wh.entity.DutyHistoryPO po where str(po.duty_date) like '2017-08-30%'");
        return objects.get(0);
    }
}
