package com.hibernate.demo.first.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student{
	@Id
	private int id;
	private String name;
	private int roll_no;
	@Column(name = "class")
	private String _class;	
	private studentAddress address;
	

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
	
	public studentAddress getAddress() {
		return address;
	}
	public void setAddress(studentAddress address) {
		this.address = address;
	}
	
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", Name ="+getName()+", roll_no=" + roll_no + ", Address =" + address + ", _class=" + _class + "]";
	}

	
}
