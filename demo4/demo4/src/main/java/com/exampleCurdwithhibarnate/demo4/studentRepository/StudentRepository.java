package com.exampleCurdwithhibarnate.demo4.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleCurdwithhibarnate.demo4.Entitites.Student;

public interface StudentRepository  extends JpaRepository<Student,Integer>{

}