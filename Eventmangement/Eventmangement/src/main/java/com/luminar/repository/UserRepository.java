package com.luminar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luminar.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	 User findByUsername(String userName);

}
