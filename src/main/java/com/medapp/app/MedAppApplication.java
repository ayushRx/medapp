package com.medapp.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medapp.app.repos.PeopleRepository;

@SpringBootApplication
public class MedAppApplication {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	PeopleRepository peopleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MedAppApplication.class, args);
	}
}
