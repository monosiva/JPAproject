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
public class StudentMarks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuid;
	private int sturoll;
	private String stuName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="foreignkey",referencedColumnName = "stuid")
	public List<Marks> marks;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public List<Marks> getMarks() {
		return marks;
	}
	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	public int getSturoll() {
		return sturoll;
	}
	public void setSturoll(int sturoll) {
		this.sturoll = sturoll;
	}

	

}
