package com.wodog.it.dao;

import com.wodog.it.model.BmsUser;
import com.wodog.it.model.BmsUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BmsUserMapper {
	
	List<BmsUser> selectAllByPage(Map<String,Integer> map);
	
	
    int countByExample(BmsUserExample example);

    int deleteByExample(BmsUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsUser record);

    int insertSelective(BmsUser record);

    List<BmsUser> selectByExample(BmsUserExample example);

    BmsUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BmsUser record, @Param("example") BmsUserExample example);

    int updateByExample(@Param("record") BmsUser record, @Param("example") BmsUserExample example);

    int updateByPrimaryKeySelective(BmsUser record);

    int updateByPrimaryKey(BmsUser record);
}