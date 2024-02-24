package com.exampleCurdwithhibarnate.demo4.Entitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	@Column(name ="student_name")
	private String name;
	@Column(name ="student_percentage")
	private float percentage;         // change to Float
	@Column(name ="student_bracnh")
	private String branch;
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}
public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
		public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrecentage(float precentage) {
		this.percentage = precentage;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student() {
		super();
	}
	public Student(String name, float precentage, String branch) {
		super();
		this.name = name;
		this.percentage = precentage;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollNo="+ rollNo + ", name=" + name + ", precentage=" + percentage + ", branch=" + branch
				+ "]";
	}

}
