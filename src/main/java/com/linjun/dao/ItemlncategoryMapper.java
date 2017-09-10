package com.linjun.dao;

import com.linjun.model.Itemlncategory;
import com.linjun.model.ItemlncategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemlncategoryMapper {
    long countByExample(ItemlncategoryCriteria example);

    int deleteByExample(ItemlncategoryCriteria example);

    int deleteByPrimaryKey(@Param("categroyid") Integer categroyid, @Param("itemid") Integer itemid);

    int insert(Itemlncategory record);

    int insertSelective(Itemlncategory record);

    List<Itemlncategory> selectByExample(ItemlncategoryCriteria example);

    int updateByExampleSelective(@Param("record") Itemlncategory record, @Param("example") ItemlncategoryCriteria example);

    int updateByExample(@Param("record") Itemlncategory record, @Param("example") ItemlncategoryCriteria example);
}