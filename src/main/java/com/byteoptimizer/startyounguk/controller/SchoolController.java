package com.byteoptimizer.startyounguk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.byteoptimizer.startyounguk.model.School;
import com.byteoptimizer.startyounguk.model.UserRoles;
import com.byteoptimizer.startyounguk.repository.SchoolRepository;
import com.byteoptimizer.startyounguk.repository.UserRepository;

@CrossOrigin
@RestController
public class SchoolController {
	
	@Autowired
	private SchoolRepository schoolRepository;
	
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
	
	@RequestMapping(method =RequestMethod.POST, value="/school", headers = "Accept=application/json, Content-type=application/json")
	public School createSchool(@RequestBody School school) {
		
		UserRoles userRoles = new UserRoles(2, "SCHOOL");
		school.getUser().setUserRoles(userRoles);
		school.getUser().setPassword("12345");
		userRepository.save(school.getUser());
		schoolRepository.save(school);
		return null;	
	}
	
	@GetMapping("/school")
	public List<School> getAllSchools() {
		return (List<School>)schoolRepository.findAll();
	}

	
	@RequestMapping(method =RequestMethod.POST, value="/test", headers = "Accept=application/json, Content-type=application/json")
	public Map<String, Object> test(@RequestBody Map<String, Object> payload) {
		return payload;
	}
}
