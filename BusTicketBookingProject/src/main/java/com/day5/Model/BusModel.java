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
@Table(name="TblBus")
public class BusModel {
     @Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bus_id;
	private String bus_No;
	private String bus_pNo;
	private long bus_type;
	private long capacity;
	 @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	   @JoinColumn(name="driver_id",referencedColumnName = "driver_id")
	   private DriverModel driver;
	public long getBus_id() {
		return bus_id;
	}
	public void setBus_id(long bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_No() {
		return bus_No;
	}
	public void setBus_No(String bus_No) {
		this.bus_No = bus_No;
	}
	public String getBus_pNo() {
		return bus_pNo;
	}
	public void setBus_pNo(String bus_pNo) {
		this.bus_pNo = bus_pNo;
	}
	public long getBus_type() {
		return bus_type;
	}
	public void setBus_type(long bus_type) {
		this.bus_type = bus_type;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public DriverModel getDriver() {
		return driver;
	}
	public void setDriver(DriverModel driver) {
		this.driver = driver;
	}
	
}
