package com.tns.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* Created by- Sanjay Kumar Vanam
 * Date Created-21/11/2023
 */
@Entity
@Table(name="certificate")
public class Certificate {
	@Id
	long id;
	int year;
	College college;
	public Certificate(long id,int year,College college) {
		this.id=id;
		this.year=year;
		this.college=college;	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	

}
