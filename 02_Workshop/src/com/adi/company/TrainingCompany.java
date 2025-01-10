package com.adi.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adi.trainer.Trainer;

@Component
public class TrainingCompany implements Company{
	
	// private Trainer trainer = new JavaTrainer(); 
	// Tightly coupled to java trainer , there can be may trainers as well
	
	private List<Trainer> trainers;
	
	public TrainingCompany() {
		this(null);
	}
	
	@Autowired
	public TrainingCompany(List<Trainer> trainers) {
		super();
		this.trainers = trainers;
	}

	public List<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}

	@Override
	public void conductTraining() {
		// TODO Auto-generated method stub
		System.out.println("Training Company :: conductTraining");
		for(Trainer trainer : trainers) {
			trainer.train();
		}
	}

	
	
}
