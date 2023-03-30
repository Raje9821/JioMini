package com.mallwebapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mallwebapp.model.Student;
import com.mallwebapp.repository.StudentRepository;

@Service
@Component
public class StudentService {

	@Autowired
	 private StudentRepository repository;
	 public void save(Student student) {
	  repository.save(student);
	 }
}
