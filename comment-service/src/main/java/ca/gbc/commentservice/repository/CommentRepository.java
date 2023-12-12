package ca.gbc.commentservice.repository;

import ca.gbc.commentservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;


import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(String postId);
}
