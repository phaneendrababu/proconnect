package com.example.SpringMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringMongoDB.model.User;


public interface UserRepository extends MongoRepository<User, String>{

}