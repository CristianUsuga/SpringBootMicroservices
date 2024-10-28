package org.springbootmicroservices.commentrating.service.impl;

import org.springbootmicroservices.commentrating.entity.Comment;
import org.springbootmicroservices.commentrating.repository.CommentRepository;
import org.springbootmicroservices.commentrating.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> getCommentsByAdvertisementId(Long advertisementId) {
        return commentRepository.findByAdvertisementId(advertisementId);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}
