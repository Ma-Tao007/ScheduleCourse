package com.system.service;

import com.system.po.StudentCustom;
import com.system.po.Sysuser;

import java.util.List;

public interface SysuserService{


    int deleteByPrimaryKey(Integer id);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    Sysuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);

    int getCount();

    List<Sysuser> findByPaging(int i);

    Boolean save(Sysuser sysuser);

    List<Sysuser> findByName(String findByName);
}
