package com.luminar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.entity.Admin;
import com.luminar.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public Admin loginUser(String userName, Long password) {
		Admin admin = adminRepository.findByUserName(userName);
		if (admin != null && admin.getPassword().equals(password)) {
			return admin;
		}
		return null;
	}

}
