package com.projectsync.service;

import com.projectsync.exception.IssueException;
import com.projectsync.exception.UserException;
import com.projectsync.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
