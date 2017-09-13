package com.linjun.service;

import com.linjun.model.Comment;

public interface CommentService {
    public int  inserts(Comment comment);
    public  int updates(int userId,Comment comment);
    public  int  delete(int id);
}
