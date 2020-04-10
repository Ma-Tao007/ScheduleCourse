package com.system.mapper;

import com.system.po.CourseSc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseScMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseSc record);

    int insertSelective(CourseSc record);

    CourseSc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSc record);

    int updateByPrimaryKey(CourseSc record);
}