package com.luminar.service;

import java.util.Optional;

import com.luminar.entity.User;

public interface UserService {
	
	 void saveUser(User user);
	    Optional<User> findUserByUsername(String username);
	    void updateUser(User user);
	    void deleteUser(User user);
		


}