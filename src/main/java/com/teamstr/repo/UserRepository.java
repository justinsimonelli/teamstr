package com.teamstr.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.teamstr.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByUserName(String userName);

}
