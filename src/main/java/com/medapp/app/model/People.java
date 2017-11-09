package com.medapp.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="people")
public class People implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@Column(name="PEOPLE_ID")
	@SequenceGenerator(name="SEQ_GEN", sequenceName="people_temp", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	private Long peopleId;
	
	
	@Column(name="FIRST_NAME" ,nullable= false)
	private String firstName;
	
	

	@Column(name="LAST_NAME",nullable= false)
	private String lastName;

	public Long getPeopleId() {
		return peopleId;
	}
	
	public People() {
	}
	
	public People(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public People(Long peopleId, String firstName, String lastName) {
		this.peopleId = peopleId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setPeopleId(Long peopleId) {
		this.peopleId = peopleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "People [peopleId=" + peopleId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}	
}
