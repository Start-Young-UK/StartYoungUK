package com.byteoptimizer.startyounguk.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.byteoptimizer.startyounguk.model.UserRoles;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRoles, Integer>  {

	@Query("Select roleid from UserRoles where rolename=?1")
	Integer findByRoleName(String roleName);

}
