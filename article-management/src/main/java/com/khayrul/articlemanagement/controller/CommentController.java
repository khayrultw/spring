package com.khayrul.articlemanagement.controller;

import com.khayrul.articlemanagement.dto.CommentRequest;
import com.khayrul.articlemanagement.entity.Comment;
import com.khayrul.articlemanagement.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment/add", method = RequestMethod.POST)
    public Comment addComment(@RequestBody CommentRequest commentRequest){
        return commentService.addComment(commentRequest);
    }

    @RequestMapping("/comments")
    public List<Comment> getComments(){
        return commentService.getComments();
    }
}
