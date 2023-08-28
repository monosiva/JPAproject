package com.day5.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dNo;
    private String aName;
    private String city;
    private String Dt;
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDt() {
		return Dt;
	}
	public void setDt(String dt) {
		Dt = dt;
	}
    
    
}
