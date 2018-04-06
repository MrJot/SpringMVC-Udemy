package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> listOfFavoiriteLanguages;
	
	private String [] operatingSystems;

	
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	public LinkedHashMap<String, String> getListOfFavoiriteLanguages() {
		return listOfFavoiriteLanguages;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public Student() {
		
//		Populate country options: used ISO code
//      "key" is for Java Code, "value" if what the user will actuall see
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FRA", "France");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("PL", "Poland");
		countryOptions.put("USA", "United Stated of America");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("IR", "Ireland");
		countryOptions.put("DE", "Germany");
		
		
		listOfFavoiriteLanguages=new LinkedHashMap<>();
		
		listOfFavoiriteLanguages.put("Java", "Java");
		listOfFavoiriteLanguages.put("Python", "Python");
		listOfFavoiriteLanguages.put("C++", "C++");
		listOfFavoiriteLanguages.put("C#", "C#");
		listOfFavoiriteLanguages.put("PHP", "PHP");
		listOfFavoiriteLanguages.put("Ruby", "Ruby");
		
	}
//Spring will use this method to populate HTML code to drop down list
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
	

}
