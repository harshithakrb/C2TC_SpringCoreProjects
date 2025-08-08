package com.tnsif.springcore_sample;

import org.springframework.stereotype.Component;

@Component
public class College {
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void display()
	{
		System.out.println("MVIT");
		student.display();
	}
		public College()
	{
		this.student=student;
		System.out.println("College obj is created");
	}
	
	
}