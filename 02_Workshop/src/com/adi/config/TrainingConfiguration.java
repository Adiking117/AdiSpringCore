package com.adi.config;

import java.beans.BeanProperty;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.adi.trainer.CsharpTrainer;
import com.adi.trainer.JavaTrainer;
import com.adi.trainer.Trainer;

@Configuration // <beans />
@ComponentScan(basePackages = "com.adi.*") // <context:component-scan base-package="com.adi.*" />
@PropertySource("classpath:app.properties")
public class TrainingConfiguration {

	@Value("${jt1.name}")
	private String jt1Name;
	
	@Value("#{${jt1.subjects}}")
	private List<String> jt1Subjects;
	
	@Value("${ct1.name}")
	private String ct1Name;
	
	@Value("#{${ct1.subjects}}")
	private List<String> ct1Subjects;
	
	@Bean
	public Trainer javaTrainer() {
		Trainer javaTrainer = new JavaTrainer(jt1Name,jt1Subjects);
		return javaTrainer;
	}
	
	@Bean
	public Trainer csharpTrainer() {
		Trainer csharpTrainer = new CsharpTrainer(ct1Name,ct1Subjects);
		return csharpTrainer;
	}
}
