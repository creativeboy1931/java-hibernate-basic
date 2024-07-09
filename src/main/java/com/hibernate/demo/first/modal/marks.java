package com.hibernate.demo.first.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class marks {
	@Id
	private int id;
	private int hindi,english,science,maths;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "marks [id=" + id + ", hindi=" + hindi + ", english=" + english + ", science=" + science + ", maths="
				+ maths + "]";
	}
	
	
}
