package com.system.mapper;

import com.system.po.PagingVO;
import com.system.po.Sysuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    Sysuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);

    int getCount();

    List<Sysuser> findByPaging(PagingVO pagingVO);

    List<Sysuser> selectByUsername(String username);

    List<Sysuser> selectLikeByUsername(String findname);
}