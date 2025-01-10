package com.adi.trainer;

import java.util.ArrayList;
import java.util.List;

public class CsharpTrainer implements Trainer{
	private String name;
	private List<String> subjects;
	
	public CsharpTrainer() {
        this("Default", new ArrayList<>());
    }
    
    public CsharpTrainer(String name, List<String> subjects) {
        super();
        this.name = name;
        this.subjects = subjects != null ? subjects : new ArrayList<>();
        System.out.println("C#Trainer with name " + name + " created");
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "CsharpTrainer [name=" + name + ", subjects=" + subjects + "]";
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("CsharpTrainer :: train");
		System.out.println("Csharp Trainer is training "+subjects);
	}
	
	
	
	
}
