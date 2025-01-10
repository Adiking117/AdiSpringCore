package com.adi.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adi.company.TrainingCompany;

@Component
public class TrainingWorkshop implements Workshop{
	private TrainingCompany trainingCompany;

	public TrainingWorkshop() {
		this(null);
	}
	
	@Autowired
	public TrainingWorkshop(TrainingCompany trainingCompany) {
		super();
		this.trainingCompany = trainingCompany;
		System.out.println("Training Workshop created");
	}

	public TrainingCompany getTrainingCompany() {
		return trainingCompany;
	}

	public void setTrainingCompany(TrainingCompany trainingCompany) {
		this.trainingCompany = trainingCompany;
	}

	@Override
	public void conductWorkshop() {
		// TODO Auto-generated method stub
		System.out.println("TrainingWorskhop :: conductWorkshop");
		trainingCompany.conductTraining();
	}
	
	
}
