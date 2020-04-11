package com.system.service.impl;

import com.system.po.PagingVO;
import com.system.po.Sysuser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.system.po.CourseSc;
import com.system.mapper.CourseScMapper;
import com.system.service.CourseScService;

import java.util.List;

@Service
public class CourseScServiceImpl implements CourseScService{

    @Resource
    private CourseScMapper courseScMapper;



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
