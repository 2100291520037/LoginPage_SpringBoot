package com.exampleCurdwithhibarnate.demo4.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleCurdwithhibarnate.demo4.Entitites.Student;
import com.exampleCurdwithhibarnate.demo4.studentRepository.StudentRepository;
@Service
public class StudentService {
	//@Autowired
	//private StudentDao studentDao;
	@Autowired
	private StudentRepository studentRepository;
	
	public void createStudent(Student student)
	{
		 this.studentRepository.save(student);
	}

}
