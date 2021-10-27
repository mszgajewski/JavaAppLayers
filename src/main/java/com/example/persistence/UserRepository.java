package com.example.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.businesslayer.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserById(Long id);
}