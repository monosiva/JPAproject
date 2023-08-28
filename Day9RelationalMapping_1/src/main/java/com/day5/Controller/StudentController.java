package com.day5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day5.Model.StudentMarks;
import com.day5.Repository.Studentrepo;

@RestController
@RequestMapping("/")
public class StudentController {
	 @Autowired
	 public Studentrepo srepo;
	 @PostMapping()
	 public StudentMarks saveDetails(StudentMarks sm){
		 return srepo.save(sm);
	 }

}
