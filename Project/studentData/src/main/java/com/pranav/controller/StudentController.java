package com.pranav.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.dao.StudentDao;
import com.pranav.pojo.Student;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	public StudentDao sdao;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return sdao.findAll();
	}
	
	@PostMapping("/student")
	public Student InsertStudent(@RequestBody Student s) {
		return sdao.save(s);
	}
	
	
	@PutMapping("/student/sid")
	public Student saveStudent(@RequestBody Student s,@PathVariable int sid) {
		Student stu = sdao.findById(sid);
		stu.setFirstName(s.getFirstName());
		stu.setLastName(s.getLastName());
		stu.setGender(s.getGender());
		stu.setEmail(s.getEmail());
		stu.setPhoneNumber(s.getPhoneNumber());
		return sdao.save(stu);
	}
	
	
	@DeleteMapping("/student/{studentId}")
	public void removeStudent(@PathVariable int studentId) {
		sdao.deleteById(studentId);
	}

	
	
}
