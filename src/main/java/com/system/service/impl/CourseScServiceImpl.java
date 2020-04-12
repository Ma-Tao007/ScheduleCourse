package com.system.service.impl;

import com.system.mapper.CourseClassMapper;
import com.system.po.CourseClass;
import com.system.po.PagingVO;
import com.system.po.Sysuser;
import com.system.utils.Utils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.system.po.CourseSc;
import com.system.mapper.CourseScMapper;
import com.system.service.CourseScService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CourseScServiceImpl implements CourseScService{

    @Resource
    private CourseScMapper courseScMapper;
    @Resource
    private CourseClassMapper courseClassMapper;



    @Override
    public int getCount() {
        return courseScMapper.getCount();
    }
    @Override
    public List<CourseSc> findByPaging(int toPageNo) {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<CourseSc> list = courseScMapper.findByPaging(pagingVO);

        return list;
    }

    @Override
    public Boolean scheduleCourse(String classname) {
        //排课之前将删除这个班级的排课记录
        courseClassMapper.deleteByClassname(classname);
        //查找该班级下所有课程
        List<CourseSc> sc = courseScMapper.selectByClassname(classname);
        //一天四门课，一周20门课
        if(sc.size()<4 || sc.size()>20){
            return false;
        }
        //排课算法
        //1.一天内课程不重复
        //2.一周上完所有的课
        //创建五个集合用于存放数据
        List<String> one = new ArrayList<>(4);//周一
        List<String> two = new ArrayList<>(4);//周二
        List<String> three = new ArrayList<>(4);//周三
        List<String> four = new ArrayList<>(4);//周四
        List<String> five = new ArrayList<>(4);//周五
        int j = 0;//用于存放每天的课
        for(int i=0;j<20;i++,j++){
            //i>=4
            if(j<4){
                one.add(sc.get(i).getName());
            }else if(j<8){
                two.add(sc.get(i).getName());
            }else if(j<12){
                three.add(sc.get(i).getName());
            }else if(j<16){
                four.add(sc.get(i).getName());
            }else if(j<20){
                five.add(sc.get(i).getName());
            }
            if(i==sc.size()-1){
                //排完将从头开始
                i=-1;
            }
        }
        //进行随机排序
        Collections.shuffle(one);
        Collections.shuffle(two);
        Collections.shuffle(three);
        Collections.shuffle(four);
        Collections.shuffle(five);
        //插入数据库
        CourseClass c1 = new CourseClass(null,classname, Utils.listToString(one,','));
        CourseClass c2 = new CourseClass(null,classname, Utils.listToString(two,','));
        CourseClass c3 = new CourseClass(null,classname, Utils.listToString(three,','));
        CourseClass c4 = new CourseClass(null,classname, Utils.listToString(four,','));
        CourseClass c5 = new CourseClass(null,classname, Utils.listToString(five,','));
        courseClassMapper.insert(c1);
        courseClassMapper.insert(c2);
        courseClassMapper.insert(c3);
        courseClassMapper.insert(c4);
        courseClassMapper.insert(c5);
        return true;
    }

    @Override
    public List<CourseSc> findByName(String findByName) {

        return courseScMapper.selectLikeByName("%"+findByName+"%");

    }

    @Override
    public Boolean save(CourseSc courseSc) {
        List<CourseSc> stu = courseScMapper.selectByName(courseSc.getName(),courseSc.getClassname());
        if (stu.size()==0) {
            courseScMapper.insert(courseSc);
            return true;
        }

        return false;
    }

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
