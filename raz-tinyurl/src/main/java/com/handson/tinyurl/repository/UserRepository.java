package com.handson.tinyurl.repository;

import com.handson.tinyurl.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// Find user by the name for returning his requests history
public interface UserRepository extends MongoRepository<User, String> {
    User findFirstByName(String name);

}

