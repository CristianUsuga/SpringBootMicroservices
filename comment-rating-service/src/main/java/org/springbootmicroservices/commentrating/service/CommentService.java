package org.springbootmicroservices.commentrating.service;

import org.springbootmicroservices.commentrating.entity.Comment;
import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    List<Comment> getAllComments();
    List<Comment> getCommentsByAdvertisementId(Long advertisementId);
    void deleteComment(Long commentId);
}
