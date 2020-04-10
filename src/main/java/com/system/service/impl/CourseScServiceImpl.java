package com.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.system.po.CourseSc;
import com.system.mapper.CourseScMapper;
import com.system.service.CourseScService;
@Service
public class CourseScServiceImpl implements CourseScService{

    @Resource
    private CourseScMapper courseScMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return courseScMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CourseSc record) {
        return courseScMapper.insert(record);
    }

    @Override
    public int insertSelective(CourseSc record) {
        return courseScMapper.insertSelective(record);
    }

    @Override
    public CourseSc selectByPrimaryKey(Integer id) {
        return courseScMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CourseSc record) {
        return courseScMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CourseSc record) {
        return courseScMapper.updateByPrimaryKey(record);
    }

}
