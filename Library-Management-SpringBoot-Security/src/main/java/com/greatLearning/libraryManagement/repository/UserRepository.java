package com.greatLearning.libraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.libraryManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUsername(String username);
}
