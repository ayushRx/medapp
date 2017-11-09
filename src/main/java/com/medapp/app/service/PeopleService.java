package com.medapp.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medapp.app.model.People;
import com.medapp.app.repos.PeopleRepository;

@Service
public class PeopleService {
	
	private static final Logger log = LoggerFactory.getLogger(PeopleService.class);
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	public PeopleService(){	}
	
	public Iterable<People> getAllPeople() {
		Iterable<People> pageOfPeople = peopleRepository.findAll();
		return pageOfPeople;
	}

	public People createPeople(People people) {
		return peopleRepository.save(people);
	}

	public void deletePeople(People people) {
		peopleRepository.delete(people);		
	}

	public void updatePeople(People people) {
		peopleRepository.save(people);
	}

}
