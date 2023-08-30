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
@Table(name="TblSchedule")
public class ScheduleModel {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long schedule_id;
      private String starting_point;
      private String destination_point;
      private String schedule_date;
      private String depature_time;
      private String arrival_time;
      private String amount;
      private String remarks;
      @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	   @JoinColumn(name="user_id",referencedColumnName = "user_id")
	   private UserModel user;
	public long getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(long schedule_id) {
		this.schedule_id = schedule_id;
	}
	public String getStarting_point() {
		return starting_point;
	}
	public void setStarting_point(String starting_point) {
		this.starting_point = starting_point;
	}
	public String getDestination_point() {
		return destination_point;
	}
	public void setDestination_point(String destination_point) {
		this.destination_point = destination_point;
	}
	public String getSchedule_date() {
		return schedule_date;
	}
	public void setSchedule_date(String schedule_date) {
		this.schedule_date = schedule_date;
	}
	public String getDepature_time() {
		return depature_time;
	}
	public void setDepature_time(String depature_time) {
		this.depature_time = depature_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	
	      
}
