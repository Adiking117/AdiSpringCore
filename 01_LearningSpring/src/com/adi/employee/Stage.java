package com.adi.employee;

public class Stage {
	private static Stage employee = null;
	
	private Stage() {
		System.out.println("Stage created");
	}
	
	public static Stage getStage() {
		if(employee == null) {
			employee = new Stage();
		}
		
		return employee;
	}
}
