package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.Marks;

public interface marksrepo extends JpaRepository<Marks, Integer>{

}
