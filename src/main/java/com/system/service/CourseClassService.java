package com.system.service;

import com.system.po.CourseClass;
import com.system.po.CourseWeek;

import java.util.List;
import java.util.Map;

public interface CourseClassService{


    int deleteByPrimaryKey(Integer id);

    int insert(CourseClass record);

    int insertSelective(CourseClass record);

    CourseClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseClass record);

    int updateByPrimaryKey(CourseClass record);

    List<CourseWeek> selectByClassname(String classname);
}
