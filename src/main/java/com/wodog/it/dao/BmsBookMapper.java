package com.wodog.it.dao;

import com.wodog.it.model.BmsBook;
import com.wodog.it.model.BmsBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookMapper {
    int countByExample(BmsBookExample example);

    int deleteByExample(BmsBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBook record);

    int insertSelective(BmsBook record);

    List<BmsBook> selectByExample(BmsBookExample example);

    BmsBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BmsBook record, @Param("example") BmsBookExample example);

    int updateByExample(@Param("record") BmsBook record, @Param("example") BmsBookExample example);

    int updateByPrimaryKeySelective(BmsBook record);

    int updateByPrimaryKey(BmsBook record);
}