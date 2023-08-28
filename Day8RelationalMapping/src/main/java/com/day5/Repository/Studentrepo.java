package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.StudentModel;

public interface Studentrepo extends JpaRepository<StudentModel, Integer> {
	

}
