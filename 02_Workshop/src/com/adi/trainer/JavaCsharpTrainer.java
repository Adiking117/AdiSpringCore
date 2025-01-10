package com.adi.trainer;

import java.util.ArrayList;
import java.util.List;

// we cannot implement a final class for AOP as subclassing for pre & post processing cannot be done
// final public class JavaCsharpTrainer {
public class JavaCsharpTrainer{
	private String name;
	private List<String> subjects;
	
	public JavaCsharpTrainer() {
        this("Default", new ArrayList<>());
    }
    
    public JavaCsharpTrainer(String name, List<String> subjects) {
        super();
        this.name = name;
        this.subjects = subjects != null ? subjects : new ArrayList<>();
        System.out.println("JavaCsharp with name " + name + " created");
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
		return "JavaCharpTrainer [name=" + name + ", subjects=" + subjects + "]";
	}

	public void train() {
		// TODO Auto-generated method stub
		System.out.println("JavaCsharpTrainer :: train");
		System.out.println("JavaCsharp Trainer is training "+subjects);
	}
	
	
	
	
}
