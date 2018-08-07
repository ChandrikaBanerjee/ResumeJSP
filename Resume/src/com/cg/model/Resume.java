package com.cg.model;

public class Resume {
private String firstName;
private String lastName;
private String gender;
private String dob;
private String address;
private String hobbies[];
private String highestQualification;
private String[] skills;
private String email;
private String website;
private String contact;
private String summary;
public Resume(String firstName, String lastName, String gender, String dob, String address, String[] hobbies,
		String highestQualification, String[] skills, String email, String website, String contact, String summary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.dob = dob;
	this.address = address;
	this.hobbies = hobbies;
	this.highestQualification = highestQualification;
	this.skills = skills;
	this.email = email;
	this.website = website;
	this.contact = contact;
	this.summary = summary;
}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @return the dob
 */
public String getDob() {
	return dob;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @return the hobbies
 */
public String[] getHobbies() {
	return hobbies;
}
/**
 * @return the highestQualification
 */
public String getHighestQualification() {
	return highestQualification;
}
/**
 * @return the skills
 */
public String[] getSkills() {
	return skills;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @return the website
 */
public String getWebsite() {
	return website;
}
/**
 * @return the contact
 */
public String getContact() {
	return contact;
}
/**
 * @return the summary
 */
public String getSummary() {
	return summary;
}

}
