package com.system.service;

import com.system.po.CourseSc;
import com.system.po.Sysuser;

import java.util.List;

public interface CourseScService{


    int deleteByPrimaryKey(Integer id);

    int insert(CourseSc record);

    int insertSelective(CourseSc record);

    CourseSc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSc record);

    int updateByPrimaryKey(CourseSc record);

    int getCount();

    List<CourseSc> findByPaging(int i);

    Boolean save(CourseSc courseSc);

    List<CourseSc> findByName(String findByName);

    Boolean scheduleCourse(String classname);
}
