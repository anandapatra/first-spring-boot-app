package com.ananda.springboot.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ananda.springboot.entity.Student;

@Repository
public class StudentRepository {

	private static Map<Integer, Student> students = new HashMap<Integer, Student>();

	static {
		students.put(1, new Student(1, "Ananda", "116 Winding Wood Dr", "732-595-9429"));
		students.put(2, new Student(2, "Dalia", "116 Winding Wood Dr", "732-666-7238"));
		students.put(3, new Student(3, "Ayaan", "116 Winding Wood Dr", "732-307-5995"));
	}

	public Collection<Student> getAllStudents() {
		return students.values();

	}

	public void add(Student student) {
		students.put(student.getId(), student);

	}

}
