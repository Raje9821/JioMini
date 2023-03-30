package com.mallwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mallwebapp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
