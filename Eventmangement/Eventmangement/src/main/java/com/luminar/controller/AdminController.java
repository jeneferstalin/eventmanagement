package com.luminar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.luminar.entity.Admin;
import com.luminar.service.AdminService;

public class AdminController {
	
	 @Autowired
	    private AdminService adminService;
	    
	
	 @GetMapping("/login")
	    public String showLoginForm(Model model) {
	        model.addAttribute("admin", new Admin());
	        return "login";
	    }

	    @PostMapping("/login")
	    public String loginUser(@ModelAttribute Admin admin, Model model) {
	       Admin authenticated = adminService.loginUser(admin.getUsername(), admin.getPassword());
	        if (authenticated != null) {
	            return "/";
	        }
	        model.addAttribute("error", "Invalid username or password");
	        return "login";
	    }
}
