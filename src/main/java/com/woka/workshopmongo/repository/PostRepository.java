package com.woka.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.woka.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{


}
