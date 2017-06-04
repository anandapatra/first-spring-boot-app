package com.ananda.springboot.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ananda.springboot.data.StudentRepository;
import com.ananda.springboot.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Collection<Student> getAllStudents() {
		return studentRepository.getAllStudents();

	}

	public void add(Student student) {
		
		studentRepository.add(student);
		
	}

}
