package com.byteoptimizer.startyounguk.repository;

import org.springframework.data.repository.CrudRepository;

import com.byteoptimizer.startyounguk.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	
}
