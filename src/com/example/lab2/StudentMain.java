package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> al =new ArrayList<Student>();
		System.out.println("Student List (ordered by the name)");
		Student s1 = new Student(101,"Kim",23);
		al.add(s1);
		Student s2 = new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Shin",24));
		al.add(new Student(105,"Lee",22));
		al.add(new Student(106,"Kwon",26));
		al.add(new Student(107,"Yoon",25));
		al.add(new Student(108,"Jang",27));
		al.add(new Student(109,"Bong",28));
		al.add(new Student(110,"Song",23));
		al.add(new Student(111,"Ahn",20));
		al.add(new Student(112,"Son",27));
		
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reversed ordered by name)");
		
		Collections.sort(al,Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
