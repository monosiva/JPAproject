package com.day5.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tblDriver")
public class DriverModel {
       @Id    
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private long driver_id;
	   private String driver_name;
	   private String driver_contact;
	   @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	   @JoinColumn(name="schedule_id",referencedColumnName = "schedule_id")
	   private ScheduleModel schedule;
	public long getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(long driver_id) {
		this.driver_id = driver_id;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getDriver_contact() {
		return driver_contact;
	}
	public void setDriver_contact(String driver_contact) {
		this.driver_contact = driver_contact;
	}
	public ScheduleModel getSchedule() {
		return schedule;
	}
	public void setSchedule(ScheduleModel schedule) {
		this.schedule = schedule;
	}
	   
}
