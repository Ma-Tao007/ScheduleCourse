package com.system.mapper;

import com.system.po.CourseClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseClass record);

    int insertSelective(CourseClass record);

    CourseClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseClass record);

    int updateByPrimaryKey(CourseClass record);

    void deleteByClassname(String classname);

    List<CourseClass> selectByClassname(String classname);
}