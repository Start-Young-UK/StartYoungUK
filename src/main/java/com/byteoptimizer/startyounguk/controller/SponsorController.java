package com.byteoptimizer.startyounguk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.byteoptimizer.startyounguk.model.School;
import com.byteoptimizer.startyounguk.model.Sponsor;
import com.byteoptimizer.startyounguk.model.UserRoles;
import com.byteoptimizer.startyounguk.repository.SponsorRepository;
import com.byteoptimizer.startyounguk.repository.UserRepository;

@CrossOrigin
@RestController
public class SponsorController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SponsorRepository sponsorRepository;
	
	@PostMapping("/sponsor")
	public School createSponsor(@RequestBody Sponsor sponsor) {
		
		UserRoles userRoles = new UserRoles(5, "SPONSOR");
		sponsor.getUser().setUserRoles(userRoles);
		sponsor.getUser().setPassword("12345");
		userRepository.save(sponsor.getUser());
		sponsorRepository.save(sponsor);
		return null;	
	}
	
	@GetMapping("/sponsor")
	public List<Sponsor> getAllSponsors() {
		return (List<Sponsor>)sponsorRepository.findAll();
	}
}
