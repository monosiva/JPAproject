package com.day5.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Details")
public class TicketBookingModel {
	  @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private int cusid;
	     @Column(name="custname")
	     private String cusName;
	     private String arrivalplace;
	     private String depatureplace;
	     private int age;
	     private int price;
	     private int phoneNo;
	     private String arrivalTime;
	     private String depatureTime;
		public int getCusid() {
			return cusid;
		}
		public void setCusid(int cusid) {
			this.cusid = cusid;
		}
		public String getCusName() {
			return cusName;
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}
		public String getArrivalplace() {
			return arrivalplace;
		}
		public void setArrivalplace(String arrivalplace) {
			this.arrivalplace = arrivalplace;
		}
		public String getDepatureplace() {
			return depatureplace;
		}
		public void setDepatureplace(String depatureplace) {
			this.depatureplace = depatureplace;
		}
		public int getAge() {
			return age;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPrice() {
			return price;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(int phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public String getDepatureTime() {
			return depatureTime;
		}
		public void setDepatureTime(String depatureTime) {
			this.depatureTime = depatureTime;
		}
	     
	  
}
