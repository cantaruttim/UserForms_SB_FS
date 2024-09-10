package com.cantaruttim.fullstack.repository;

import com.cantaruttim.fullstack.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
