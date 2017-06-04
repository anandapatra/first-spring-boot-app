package com.ananda.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ananda.springboot.entity.Student;
import com.ananda.springboot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/all")
	public Collection<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, consumes="application/json")
	public void addStudent(@RequestBody Student student) {
		studentService.add(student);
	}

}
