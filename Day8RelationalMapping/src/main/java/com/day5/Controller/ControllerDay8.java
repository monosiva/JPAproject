package com.day5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day5.Model.StudentModel;
import com.day5.Repository.Studentrepo;

@RestController
@RequestMapping("/")
public class ControllerDay8 {
  
	 @Autowired
	 public Studentrepo srepo;
	 @PutMapping()
	 public StudentModel saveDetails(StudentModel sm){
		 return srepo.save(sm);
	 }
}
