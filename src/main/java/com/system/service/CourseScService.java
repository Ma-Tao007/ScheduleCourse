package com.system.service;

import com.system.po.CourseSc;
public interface CourseScService{


    int deleteByPrimaryKey(Integer id);

    int insert(CourseSc record);

    int insertSelective(CourseSc record);

    CourseSc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSc record);

    int updateByPrimaryKey(CourseSc record);

}
