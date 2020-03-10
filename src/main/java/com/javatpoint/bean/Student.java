package com.javatpoint.bean;

import javax.persistence.*;
import javax.persistence.GenerationType;

@Entity
@Table(name="adarsh2")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll_no", length=0)
	private int roll;
	@Column(name="student_name", length=0)
	private String sname;
	@Column(name="course", length=0)
	private String course;
	@Column(name="fee", length=0)
	private double fee;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	

}
