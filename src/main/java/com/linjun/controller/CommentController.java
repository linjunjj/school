package com.linjun.controller;

import com.linjun.model.Comment;
import com.linjun.service.CommentService;
import com.sun.javafx.binding.StringFormatter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "用户评论管理")
@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    CommentService commentService;
    @ApiOperation(value = "添加数据",notes = "根据comment添加数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public  @ResponseBody int insert(@RequestParam(value ="commentType")String commentType,
               @RequestParam(value = "parentID") int parentID,@RequestParam(value = "commentObjectID")int commentObjectID,
               @RequestParam(value = "ownerID")int ownerID,@RequestParam(value ="userID")int userID,@RequestParam(value = "author")String author,
               @RequestParam(value = "subject")String subject,@RequestParam(value = "boby")String body,@RequestParam(value = "isPrivate")String isPrivate,
               @RequestParam(value = "ip")String ip){
        Comment comment=new Comment();
        comment.setCommenttype(commentType);
        comment.setParentid(parentID);
        comment.setCommentobjectid(commentObjectID);
        comment.setOwnerid(ownerID);
        comment.setUserid(userID);
        comment.setAuthor(author);
        comment.setBody(body);
        comment.setIsprivate(isPrivate);
        comment.setIp(ip);
        comment.setDatacreate(new Date());
        return commentService.inserts(comment);
    }
   @ApiOperation(value = "更新评论数据",notes = "更新评论数据",produces = "application/json")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(@RequestParam(value ="commentType")String commentType,
                                     @RequestParam(value = "parentID") int parentID,@RequestParam(value = "commentObjectID")int commentObjectID,
                                     @RequestParam(value = "ownerID")int ownerID,@RequestParam(value ="userID")int userID,@RequestParam(value = "author")String author,
                                     @RequestParam(value = "subject")String subject,@RequestParam(value = "boby")String body,@RequestParam(value = "isPrivate")String isPrivate,
                                     @RequestParam(value = "ip")String ip){

       Comment comment=new Comment();
       comment.setCommenttype(commentType);
       comment.setParentid(parentID);
       comment.setCommentobjectid(commentObjectID);
       comment.setOwnerid(ownerID);
       comment.setAuthor(author);
       comment.setBody(body);
       comment.setIsprivate(isPrivate);
       comment.setIp(ip);
       comment.setDatacreate(new Date());
       return commentService.updates(userID,comment);
   }
  @ApiOperation(value = "删除数据",notes = "根据userID删除数据",produces = "application/json")
    @DeleteMapping(value = "/delete/{userID}")
    public  @ResponseBody int delete(@PathVariable int userID){
      return commentService.delete(userID);
  }


}
