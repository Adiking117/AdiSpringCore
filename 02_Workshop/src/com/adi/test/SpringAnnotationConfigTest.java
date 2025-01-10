package com.adi.test;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adi.config.TrainingConfiguration;
import com.adi.trainer.JavaCsharpTrainer;
import com.adi.trainer.Trainer;
import com.adi.workshop.TrainingWorkshop;
import com.adi.workshop.Workshop;

public class SpringAnnotationConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfiguration.class);
		System.out.println("-------------Spring Context Loaded--------------");
		
		Trainer trainer = context.getBean("javaTrainer",Trainer.class);
		System.out.println("class of trainer " + trainer.getClass());
		//Any class which implements some interface , JVM will create dynamic proxy class
		/*
		 * class DProxy implements Trainer{
		 * 		JavaTrainer jt = new JavaTrainer();
		 * 		public void train(){
		 * 			// pre-processing
		 * 			// jt.train();
		 * 			// post-processing
		 * 		}
		 * }
		 * At Run time DProxy gets created
		 * DProxy dp = new DProxy();
		 * dp.train();
		 * this will merge boilerplate code with business logic
		 */
		
		
		JavaCsharpTrainer javaCsharpTrainer = context.getBean("javaCsharpTrainer",JavaCsharpTrainer.class);
		System.out.println("class of javaCsharpTrainer "+ javaCsharpTrainer.getClass());
		// JAvaCsharp class doesnt implement anty interface therby creating Static proxy
		
		
		
		
		Workshop trainingWorkshop = context.getBean("trainingWorkshop",TrainingWorkshop.class);
		trainingWorkshop.conductWorkshop();
	}

}
