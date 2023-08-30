package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.UserModel;

public interface Userrepo extends JpaRepository<UserModel, Integer>{

}
