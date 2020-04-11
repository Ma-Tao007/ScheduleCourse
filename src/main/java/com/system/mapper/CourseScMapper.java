package com.system.mapper;

import com.system.po.CourseSc;
import com.system.po.PagingVO;
import com.system.po.Sysuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseScMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseSc record);

    int insertSelective(CourseSc record);

    CourseSc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSc record);

    int updateByPrimaryKey(CourseSc record);

    int getCount();

    List<CourseSc> findByPaging(PagingVO pagingVO);

    List<CourseSc> selectByName(@Param("name") String name,@Param("classname")String classname);

    List<CourseSc> selectLikeByName(String name);
}