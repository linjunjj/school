package com.linjun.dao;

import com.linjun.model.Comment;
import com.linjun.model.CommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    long countByExample(CommentCriteria example);

    int deleteByExample(CommentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentCriteria example);

    Comment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}