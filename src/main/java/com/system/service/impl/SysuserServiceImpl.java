package com.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.system.po.Sysuser;
import com.system.mapper.SysuserMapper;
import com.system.service.SysuserService;
@Service
public class SysuserServiceImpl implements SysuserService{

    @Resource
    private SysuserMapper sysuserMapper;

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
