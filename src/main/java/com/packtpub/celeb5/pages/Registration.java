package com.packtpub.celeb5.pages;

import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;

import com.packtpub.celeb5.model.Gender;

public class Registration {
	
	@Persist
	private String userName;
	@Persist
	private String password;
	private String password2;
	@Persist
	private Gender gender;
	@Persist
	private boolean subscribe;
	@Persist
	private String email;
	private boolean unsubscribe;
	
	public boolean isUnsubscribe() {
		return unsubscribe;
	}

	public void setUnsubscribe(boolean unsubscribe) {
		this.unsubscribe = unsubscribe;
	}

	public boolean isSubscribe() {
		return subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		System.out.println("Setting subscribe: " + subscribe);
		this.subscribe = subscribe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		System.out.println("Setting gender: "+ gender);
		this.gender = gender;
	}

	public Gender getMale(){
		return Gender.MALE;
	}
	
	public Gender getFemale(){
		return Gender.FEMALE;
	}

	void onSubmitFromRegistrationForm(){
		System.out.println("The form was submitted!");
		if (unsubscribe) 
			subscribe = false;
	}
	
	public boolean isPasswordNotSubmitted(){
		return userName == null;	
	}

	@OnEvent(component="submitButton")
	void onSubmitButton()
	{
	  System.out.println("Submit button was pressed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1!");
	  // TODO: Some code to actually register the user
	}


	
}
