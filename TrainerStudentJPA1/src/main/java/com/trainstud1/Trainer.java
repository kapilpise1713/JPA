package com.trainstud1;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainer_data")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t_id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Salary")
	private int salary;
	@Column(name = "Subject")
	private String subject;
	
	@OneToMany(mappedBy = "trainer", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	Set<Student> students = new HashSet<Student>();

	public Trainer() {
		super();
	}

	public Trainer(String name, int salary, String subject, Set<Student> students) {
		super();
		this.name = name;
		this.salary = salary;
		this.subject = subject;
		this.students = students;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	
	
	
	
	

}
