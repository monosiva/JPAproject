package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.ScheduleModel;

public interface Schedulerepo extends JpaRepository<ScheduleModel, Integer>{

}
