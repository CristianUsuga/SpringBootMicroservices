package org.springbootmicroservices.commentrating.controller;

import org.springbootmicroservices.commentrating.entity.Comment;
import org.springbootmicroservices.commentrating.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        return ResponseEntity.ok(commentService.saveComment(comment));
    }

    @GetMapping
    public ResponseEntity<List<Comment>> getAllComments() {
        return ResponseEntity.ok(commentService.getAllComments());
    }

    @GetMapping("/advertisement/{advertisementId}")
    public ResponseEntity<List<Comment>> getCommentsByAdvertisementId(@PathVariable Long advertisementId) {
        return ResponseEntity.ok(commentService.getCommentsByAdvertisementId(advertisementId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
        return ResponseEntity.noContent().build();
    }
}
