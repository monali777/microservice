package com.employer.profile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="employees")
@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

@Column(name="first_name")
private String firstName;

@Column(name="last_name")
private String lastName;

@Column(name="email_Id")
private String emailId;

@Column(name="city")
private String city;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
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

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Employee(long id, String firstName, String lastName, String emailId, String city) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.city = city;
}

public Employee() {
	super();
}



}
