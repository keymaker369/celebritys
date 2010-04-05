package com.packtpub.celeb5.pages;

public class Registration {
	
	private String userName;
	private String password;
	private String password2;
	private String gender;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		System.out.println("Setting user name: " + userName);
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		System.out.println("Setting password: " + password);
		this.password = password;
	}
	
	public String getPassword2() {
		return password2;
	}
	
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		System.out.println("Setting gender: " + gender);
		this.gender = gender;
	}

	void onSubmitFromRegistrationForm(){
		System.out.println("The form was submitted!");
	}

}
