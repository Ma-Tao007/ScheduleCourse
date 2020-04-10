package com.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.system.po.CourseClass;
import com.system.mapper.CourseClassMapper;
import com.system.service.CourseClassService;
@Service
public class CourseClassServiceImpl implements CourseClassService{

    @Resource
    private CourseClassMapper courseClassMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return courseClassMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CourseClass record) {
        return courseClassMapper.insert(record);
    }

    @Override
    public int insertSelective(CourseClass record) {
        return courseClassMapper.insertSelective(record);
    }

    @Override
    public CourseClass selectByPrimaryKey(Integer id) {
        return courseClassMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CourseClass record) {
        return courseClassMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CourseClass record) {
        return courseClassMapper.updateByPrimaryKey(record);
    }

}
