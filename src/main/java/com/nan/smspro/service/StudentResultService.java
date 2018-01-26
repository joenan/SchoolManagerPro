package com.nan.smspro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nan.smspro.dao.StudentresultRepository;
import com.nan.smspro.entity.Studentresult;

@Service("studentResultService")
public class StudentResultService  {

	
	@Autowired
	StudentresultRepository service;

	@Transactional
	public Iterable<Studentresult> findAll() {
		return service.findAll();
	}

	@Transactional	
	public <S extends Studentresult> S save(S arg0) {
		return service.save(arg0);
	}

	@Transactional	
	public <S extends Studentresult> Iterable<S> save(Iterable<S> arg0) {
		return service.save(arg0);
	}

	@Transactional	
	public long count() {
		return service.count();
	}

	@Transactional	
	public void delete(Integer arg0) {
		service.delete(arg0);
	}

	@Transactional	
	public void delete(Iterable<? extends Studentresult> arg0) {
		service.delete(arg0);
	}

	@Transactional	
	public void delete(Studentresult arg0) {
		service.delete(arg0);
	}

	@Transactional	
	public void deleteAll() {
		service.deleteAll();
	}

	@Transactional	
	public boolean exists(Integer arg0) {
		return service.exists(arg0);
	}

	@Transactional	
	public Iterable<Studentresult> findAll(Iterable<Integer> arg0) {
		return service.findAll(arg0);
	}

	@Transactional	
	public Studentresult findOne(Integer arg0) {
		return service.findOne(arg0);
	}

	public List<Studentresult> findByMatNo(String matNo) {
		return service.findByMatNo(matNo);
	}

	public Studentresult find(String matNo) {
		return service.find(matNo);
	}

	
	
	
	
}