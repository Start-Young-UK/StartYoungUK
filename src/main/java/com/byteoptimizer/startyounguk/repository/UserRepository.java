package com.byteoptimizer.startyounguk.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.byteoptimizer.startyounguk.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("FROM User u INNER JOIN u.userRoles r where u.userid=?1 AND r.rolename=?2")
	public User findByIdAndRole(Long userId, String roleName);
	
}
