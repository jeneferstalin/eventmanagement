package com.luminar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.luminar.entity.User;
import com.luminar.service.UserService;


public class UserController {
	
	
	 @Autowired
	    private UserService userService;
	    
	    @GetMapping("/")
	    public String defaultPage() {
	        return "index";
	    }

	    @GetMapping("/register")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("user", new User());
	        return "index";
	    }

	    @PostMapping("/register")
	    public String registerUser(@ModelAttribute User user, Model model) {
	        userService.saveUser(user);
	        return "register successfully";
	    }


	
	/*
	 * @Autowired private UserServiceImp userService;
	 * 
	 * 
	 * @GetMapping("/") public String defaultPage() { return "error"; }
	 * 
	 * @GetMapping("/index") public String showRegistrationForm(Model model) {
	 * model.addAttribute("user", new User()); return "index"; }
	 * 
	 * 
	 * 
	 * @PostMapping("/") public String registerUser(@RequestBody User user) {
	 * userService.registerUser(user);
	 * 
	 * return "register successfully"; }
	 */

}
