package com.adi.test;

import java.util.ArrayList;
import java.util.List;

import com.adi.company.Company;
import com.adi.company.TrainingCompany;
import com.adi.trainer.CsharpTrainer;
import com.adi.trainer.JavaTrainer;
import com.adi.trainer.Trainer;
import com.adi.workshop.TrainingWorkshop;
import com.adi.workshop.Workshop;

public class NonSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> JavaSubjects = new ArrayList<>();
		JavaSubjects.add("OOP");
		JavaSubjects.add("Collections");
		JavaSubjects.add("Multithrading");
		JavaSubjects.add("Spring");
		
		List<String> CSharpSubjects = new ArrayList<>();
		CSharpSubjects.add("Delegates");
		CSharpSubjects.add("AsyncAwait");
		CSharpSubjects.add("FileSystem");
		CSharpSubjects.add("EFCore");
		
		
		Trainer trainer1 = new JavaTrainer("Adiking",JavaSubjects);
		Trainer trainer2 = new CsharpTrainer("Shriraj",CSharpSubjects);
		
		List<Trainer> allTrainers = new ArrayList<Trainer>();
		allTrainers.add(trainer1);
		allTrainers.add(trainer2);
		
		TrainingCompany company = new TrainingCompany(allTrainers);
		Workshop workshop = new TrainingWorkshop(company);
		
		workshop.conductWorkshop();
		
	}

}
