package com.cloning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneMain {

	public static void main(String[] args) {
		
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("Spring");
		
		Employee e1 = new Employee(1, "Emp1", skills);
		
		Employee e2 = (Employee) e1.clone();
		
		e2.setId(2);
		e2.setName("Emp2");
		
		System.out.println(e1);
		System.out.println(e2);
		
		e2.addSkill("Hibernate");

		System.out.println(e1);
		System.out.println(e2);
		
	}

}
