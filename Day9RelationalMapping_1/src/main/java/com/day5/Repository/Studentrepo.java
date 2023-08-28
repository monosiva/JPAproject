package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.StudentMarks;


public interface Studentrepo extends JpaRepository<StudentMarks, Integer>{

}
