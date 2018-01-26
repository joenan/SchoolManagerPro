package com.nan.smspro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nan.smspro.entity.Studentresult;

public interface StudentresultRepository extends CrudRepository<Studentresult, Integer> {

	@Query("select u from Studentresult u where u.matNo = ?1")
	List<Studentresult> findByMatNo(String matNo);
	
	@Query("select u from Studentresult u where u.matNo = ?1")
	Studentresult find(String matNo);

	
}
