package com.tns.controller;
/* Created by- Sanjay Kumar Vanam
 * Date Created-21/11/2023
 */

public class Certificate {
	long id;
	int year;
	College college;
	public Certificate() {
		
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
