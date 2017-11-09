package com.medapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medapp.app.model.People;
import com.medapp.app.service.PeopleService;

@RestController
@RequestMapping(value="/services/v1")
public class MedAppContoller {
	
	@Autowired
	private PeopleService peopleService;
	
	//View All Users
	@RequestMapping(value="/getAllPeople",method = RequestMethod.GET, produces= {"application/json"} )
	public  @ResponseBody Iterable<People> getAllPeople(){
			   return peopleService.getAllPeople();
	}
	
	//Create Users
	@RequestMapping(value="/createPeople",method = RequestMethod.POST, consumes = "application/json",produces= "application/json")
	public   People  createPeople(@RequestBody People people){
		return peopleService.createPeople(people);
	}
	
	//Delete User
	@RequestMapping(value="/deletePeople",method = RequestMethod.PUT ,consumes= "application/json")
	public  void deletePeople(@RequestBody People people){
		peopleService.deletePeople(people);
	}
	
	//Update User
	@RequestMapping(value="/updatePeople",method = RequestMethod.PUT, consumes= "application/json")
	public   void  updatePeople(@RequestBody People people){
		peopleService.updatePeople(people);
	}
	
}
