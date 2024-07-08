package com.hibernate.demo.first.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	int id;
	String name;
	int roll_no;
	@Column(name = "class")
	String _class;
	
	//	#operational methods
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
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", roll_no=" + roll_no + ", _class=" + _class + "]";
	}
	
}
