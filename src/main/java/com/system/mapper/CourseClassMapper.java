package com.system.mapper;

import com.system.po.CourseClass;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseClass record);

    int insertSelective(CourseClass record);

    CourseClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseClass record);

    int updateByPrimaryKey(CourseClass record);
}