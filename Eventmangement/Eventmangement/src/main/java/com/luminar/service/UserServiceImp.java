package com.luminar.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.entity.User;
import com.luminar.repository.UserRepository;

@Service
public class UserServiceImp {
	
	 @Autowired
	    private UserRepository userRepository;

	    public void saveUser(User user) {
	        userRepository.save(user);
	    }

	    public Optional<User> findUserByUsername(String username) {
	        return Optional.ofNullable(userRepository.findByUsername(username));
	    }

	    
	    public void updateUser(User user) {
	        userRepository.save(user);
	    }

	   // @Override
	    public void deleteUser(User user) {
	        userRepository.delete(user);
	    }


	
}
