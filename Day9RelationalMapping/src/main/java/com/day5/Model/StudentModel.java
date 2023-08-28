package com.day5.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class StudentModel {
     @Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
    private String sname;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_id",referencedColumnName = "aid")
    private List<Address> addr;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Address> getAddr() {
		return addr;
	}
	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}
    
	
}
