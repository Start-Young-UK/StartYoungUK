package com.byteoptimizer.startyounguk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.byteoptimizer.startyounguk.model.User;
import com.byteoptimizer.startyounguk.repository.UserRepository;
import com.byteoptimizer.startyounguk.repository.UserRolesRepository;

@RestController
public class SchoolController {
	
	@Autowired
	private UserRepository userRepository;
	
	
//	@GetMapping("user/{userId}")
//	public User fetchUser(@PathVariable String userId, @RequestParam String roleName) {
//		User user = null;
//		if(userId != null) {
//			user = userRepository.findByIdAndRole(Long.valueOf(userId), roleName);
//		}
//		return user;
//		
//	}
//	
//	@PostMapping("register")
//	public String registerUser(@RequestBody User userBody) {
//		User user = null;
//		Integer roleId = 0;
//		
//		return "";
//		
//	}

}