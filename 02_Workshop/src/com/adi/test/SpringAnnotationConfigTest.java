package com.adi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adi.config.TrainingConfiguration;
import com.adi.workshop.TrainingWorkshop;
import com.adi.workshop.Workshop;

public class SpringAnnotationConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfiguration.class);
		System.out.println("-------------Spring Context Loaded--------------");
		Workshop trainingWorkshop = context.getBean("trainingWorkshop",TrainingWorkshop.class);
		trainingWorkshop.conductWorkshop();
	}

}
