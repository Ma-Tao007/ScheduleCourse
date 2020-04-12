package com.system.service.impl;

import com.system.po.CourseWeek;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.system.po.CourseClass;
import com.system.mapper.CourseClassMapper;
import com.system.service.CourseClassService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public List<CourseWeek> selectByClassname(String classname) {
        //通过班级名找对应的班级
        List<CourseClass> list = courseClassMapper.selectByClassname(classname);
        List<CourseWeek> weeks = new ArrayList<>();
        CourseWeek monday1 = new CourseWeek();
        CourseWeek monday2 = new CourseWeek();
        CourseWeek after1 = new CourseWeek();
        CourseWeek after2 = new CourseWeek();
        for(int i=0;i<list.size();i++){
            CourseClass c = list.get(i);
            //每一个课程分开
            String[] courses = c.getCourseids().split(",");
            if(i==0) {
                monday1.setOne(courses[0]);
                monday2.setOne(courses[1]);
                after1.setOne(courses[2]);
                after2.setOne(courses[3]);
            }else if(i==1){
                monday1.setTwo(courses[0]);
                monday2.setTwo(courses[1]);
                after1.setTwo(courses[2]);
                after2.setTwo(courses[3]);
            }else if(i==2){
                monday1.setThree(courses[0]);
                monday2.setThree(courses[1]);
                after1.setThree(courses[2]);
                after2.setThree(courses[3]);
            }else if(i==3){
                monday1.setFour(courses[0]);
                monday2.setFour(courses[1]);
                after1.setFour(courses[2]);
                after2.setFour(courses[3]);
            }else if(i==4){
                monday1.setFive(courses[0]);
                monday2.setFive(courses[1]);
                after1.setFive(courses[2]);
                after2.setFive(courses[3]);
            }
        }
        weeks.add(monday1);
        weeks.add(monday2);
        weeks.add(after1);
        weeks.add(after2);
        return weeks;
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
