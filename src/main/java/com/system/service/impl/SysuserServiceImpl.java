package com.system.service.impl;

import com.system.po.PagingVO;
import com.system.po.Student;
import com.system.po.StudentCustom;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.system.po.Sysuser;
import com.system.mapper.SysuserMapper;
import com.system.service.SysuserService;

import java.util.List;

@Service
public class SysuserServiceImpl implements SysuserService {

    @Resource
    private SysuserMapper sysuserMapper;

    @Override
    public int getCount() {
        return sysuserMapper.getCount();
    }
    @Override
    public List<Sysuser> findByPaging(int toPageNo) {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<Sysuser> list = sysuserMapper.findByPaging(pagingVO);

        return list;
    }

    @Override
    public List<Sysuser> findByName(String findByName) {

         return sysuserMapper.selectLikeByUsername("%"+findByName+"%");

    }

    @Override
    public Boolean save(Sysuser sysuser) {
        List<Sysuser> stu = sysuserMapper.selectByUsername(sysuser.getUsername());
        if (stu.size()==0) {
            sysuserMapper.insert(sysuser);
            return true;
        }

        return false;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Sysuser record) {
        return sysuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Sysuser record) {
        return sysuserMapper.insertSelective(record);
    }

    @Override
    public Sysuser selectByPrimaryKey(Integer id) {
        return sysuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Sysuser record) {
        return sysuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sysuser record) {
        return sysuserMapper.updateByPrimaryKey(record);
    }




}
