package com.qa.beanvalidation;

public class Profile {

	private String forename;
	private String surname;
	private String dateOfBirth;
	private String gender;
	private String ethnicity;
	
	public Profile() {}
	
	public Profile(String forename, String surname, String dateOfBirth, String gender, String ethnicity) {
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.ethnicity = ethnicity;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	@Override
	public String toString() {
		return "Profile [forename=" + forename + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", ethnicity=" + ethnicity + "]";
	}
	
		public void init() {
		System.out.println("Initialisation ...");	
	}
	
	public void cleanUp() {
		System.out.println("Cleaning up ...");
	}
	
	
}
