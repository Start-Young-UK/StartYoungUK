package com.byteoptimizer.startyounguk.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.byteoptimizer.startyounguk.model.Children;

public interface ChildrenRepository extends CrudRepository<Children, Integer>  {
	
	@Query("FROM Children WHERE childrenid=?1")
	public Children findByIdCustom(Integer i);

}
