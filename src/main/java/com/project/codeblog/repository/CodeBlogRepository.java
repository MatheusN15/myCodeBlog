package com.project.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.codeblog.entity.Post;

@Repository
public interface CodeBlogRepository extends JpaRepository<Post, Long>{

}
