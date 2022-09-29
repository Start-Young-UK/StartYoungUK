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
public class AuthController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserRolesRepository userroleRepository;
	
	@GetMapping("user/{email}")
	public User fetchUserByEmail(@PathVariable String email, @RequestParam String roleName) {
		User user = null;
		if(email != null) {
			user = userRepository.findByEmailAndRole(email, roleName);
		}
		return user;
		
	}
	
	@PostMapping("register")
	public String registerUser(@RequestBody User userBody) {
		User user = null;
		Integer roleId = 0;
		if(userBody != null) {
			if(userBody.getUserRoles().getRolename() != null) {
				roleId = userroleRepository.findByRoleName(userBody.getUserRoles().getRolename().toUpperCase());
				if(roleId != 0) {
					userBody.getUserRoles().setRoleid(roleId);
					try {
						user = userRepository.save(userBody);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return user.getUsername();
		
	}
	
	@GetMapping("/healthcheck")
	public String healthCheck() {
		return "HealthCheck is Successful";
	}

}
