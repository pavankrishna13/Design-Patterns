package com.cloning;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	
	private int empId;
	
	private String name;
	
	private List<String> skillList;
	
	public Employee(int empId, String name, List<String> skillList) {
		super();
		this.empId = empId;
		this.name= name;
		this.skillList = skillList;
	}
	
	public void addSkill(String skill) {
		if(skill != null)  {
			this.skillList.add(skill);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+ " " + this.empId + " " + this.skillList.toString();
	}
	
	public Object clone() {
		// TODO Auto-generated method stub
		try {
			Employee cloneEmp = (Employee) super.clone();
			cloneEmp.setSkillList(new ArrayList<>(this.skillList));
			return cloneEmp;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	
	public void setId(int empid) {
		this.empId = empid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}


}
