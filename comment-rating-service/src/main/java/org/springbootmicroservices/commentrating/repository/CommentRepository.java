package org.springbootmicroservices.commentrating.repository;

import org.springbootmicroservices.commentrating.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByAdvertisementId(Long advertisementId);
}
