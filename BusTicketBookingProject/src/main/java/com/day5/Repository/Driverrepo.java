package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.DriverModel;

public interface Driverrepo extends JpaRepository<DriverModel, Integer>{

}
