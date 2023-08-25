package com.example.day5.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.model.model;

public interface repo extends JpaRepository<model, Integer>{

}
