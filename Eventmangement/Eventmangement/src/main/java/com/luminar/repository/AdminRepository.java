package com.luminar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luminar.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
	
	Admin findByUserName(String userName );

}
