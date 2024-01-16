package com.pranav.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.pojo.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

	List<Student> findAll();

	Student findById(int sid);

	void deleteById(int studentId);
	
}


