package com.linjun.service.impl;

import com.linjun.dao.CommentMapper;
import com.linjun.model.Comment;
import com.linjun.model.CommentCriteria;
import com.linjun.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    public int inserts(Comment coment) {
        return commentMapper.insert(coment);
    }

    public int updates(int userid,Comment comment) {
        CommentCriteria commentCriteria=new CommentCriteria();
        CommentCriteria.Criteria criteria=commentCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);


        return commentMapper.updateByExample(comment,commentCriteria);
    }

    public int delete(int id) {
        CommentCriteria commentCriteria=new CommentCriteria();
        CommentCriteria.Criteria criteria=commentCriteria.createCriteria();
        criteria.andUseridEqualTo(id);
        return commentMapper.deleteByExample(commentCriteria);
    }
}
