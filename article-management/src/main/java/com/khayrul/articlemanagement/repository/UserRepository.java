package com.khayrul.articlemanagement.repository;

import com.khayrul.articlemanagement.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserById(Integer id);
}
