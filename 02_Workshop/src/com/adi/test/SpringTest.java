package com.adi.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adi.trainer.JavaTrainer;
import com.adi.trainer.Trainer;
import com.adi.workshop.TrainingWorkshop;
import com.adi.workshop.Workshop;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Trainer trainer = context.getBean("javaTrainer",JavaTrainer.class);
//		System.out.println(trainer);
		// trainer.train();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("workshop.xml");;
		System.out.println("-------------Spring Context Loaded--------------");
		Workshop trainingWorkshop = context.getBean("trainingWorkshop",TrainingWorkshop.class);
		trainingWorkshop.conductWorkshop();
		
//		try {
//			
//		} finally {
//			context.close();
//		}
		
		
		
	}
}
