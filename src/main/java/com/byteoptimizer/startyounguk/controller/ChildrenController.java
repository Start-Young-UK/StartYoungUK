package com.byteoptimizer.startyounguk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.byteoptimizer.startyounguk.model.Children;
import com.byteoptimizer.startyounguk.model.School;
import com.byteoptimizer.startyounguk.model.UserRoles;
import com.byteoptimizer.startyounguk.repository.ChildrenRepository;
import com.byteoptimizer.startyounguk.repository.GuardianRepository;
import com.byteoptimizer.startyounguk.repository.UserRepository;

@CrossOrigin
@RestController
public class ChildrenController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ChildrenRepository childrenRepository;
	
	@Autowired
	private GuardianRepository guardianRepository;
	
	@Autowired
	private SchoolController schoolController;
	
	
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
//	public String registerUser(@RequestBody Children userBody) {
//		Children user = null;
//		Integer roleId = 0;
//		
//		return "";
//		
//	}
	
	@GetMapping("/children")
	public List<Children> getAllChildren(){
		return (List<Children>) childrenRepository.findAll();
	}
	
	@PostMapping("/children")
	public void addChildren(@RequestBody Children children) {
		
		UserRoles userRoles = new UserRoles(4, "CHILDREN");
		UserRoles userRoles1 = new UserRoles(3, "GUARDIAN");
		children.getUser().setUserRoles(userRoles);
		children.getUser().setPassword("12345");
		userRepository.save(children.getUser());
		children.getGuardian().getUser().setUserRoles(userRoles1);
		children.getGuardian().getUser().setPassword("12345");
		userRepository.save(children.getGuardian().getUser());
		guardianRepository.save(children.getGuardian());
		
		List<School> school = schoolController.getAllSchools();
		
		for(School sch : school) {
			if(children.getGuardian().getAnnualIncome() < 250000 && sch.getScholarshipOffering() >= 80) {
				children.setSchool(sch);
				break;
			} else if(children.getGuardian().getAnnualIncome() >= 250000 && sch.getScholarshipOffering() < 80) {
				children.setSchool(sch);
				break;
			}
		}
		
		childrenRepository.save(children);
	}

	@GetMapping("/children/{childrenId}")
	public Children getChildrenById(@PathVariable String childrenId){
		Integer l = new Integer(Integer.parseInt(childrenId));
		
		return childrenRepository.findByIdCustom(l);
	}
}
