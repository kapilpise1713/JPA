package com.studentinfo;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stu_info")

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name ="Age")
	private int age;
	@Column(name="Course")
	private String course;
	@Column(name="O_Email")
	@ElementCollection
	private List<P_Email> padd=new ArrayList<P_Email>();
	
	
	public Student() {
		super();
	}


	public Student(int id, String name, int age, String course, List<P_Email> padd) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.padd = padd;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public List<P_Email> getPadd() {
		return padd;
	}


	public void setPadd(List<P_Email> padd) {
		this.padd = padd;
	}
	
	
	
	
	
	

}
