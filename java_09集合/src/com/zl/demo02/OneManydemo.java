package com.zl.demo02;

public class OneManydemo {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("张老师",18,"nan");
		Student s1 = new Student("tom",18);
		Student s2 = new Student("zl",18);
		Student s3 = new Student("vince",18);
		//关联关系
		t1.getStudents().add(s1);
		t1.getStudents().add(s2);
		t1.getStudents().add(s3);
		
		s1.setT(t1);
		s2.setT(t1);
		s3.setT(t1);
		print(t1);
	}
	public static void print(Teacher t) {
		System.out.println(t.getName());
		for (Student s : t.getStudents()) {
			System.out.println(s);
		}
	}
	
}
