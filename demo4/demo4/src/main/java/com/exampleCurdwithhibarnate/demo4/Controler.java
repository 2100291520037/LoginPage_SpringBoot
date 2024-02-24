package com.exampleCurdwithhibarnate.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exampleCurdwithhibarnate.demo4.Entitites.Student;
import com.exampleCurdwithhibarnate.demo4.studentService.StudentService;
import com.exampleCurdwithhibarnate.demo4.user.User;



@Controller
public class Controler {
	@Autowired
	private StudentService studentserivce;
	
	@RequestMapping("/Login")
	public String showform()
	{
		return "Login";
	}
	@PostMapping("/Process")
	 public String authenticate(@ModelAttribute Student student, Model model) {
	        // Perform authentication logic here
		      //System.out.println(student);
	        // For example, you might check the email and password against a database
	        model.addAttribute("message","Succesfully Add your DataBase");
	        this.studentserivce.createStudent(student);
	        
	        return "Success";
	    }

}
