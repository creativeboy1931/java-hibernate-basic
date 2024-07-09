package com.hibernate.demo.first.modal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class studentResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean result;
	
	@OneToOne(cascade = CascadeType.REMOVE,fetch=FetchType.EAGER)  //cascade is used to remove forigen key table 
	@JoinColumn(name="student_marks")
	private marks studentMarks;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public marks getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(marks studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "studentResult [id=" + id + ", result=" + result + ", studentMarks=" + studentMarks + "]";
	}
	
	
	
	
}
