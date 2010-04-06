package com.packtpub.celeb5.pages;

import org.apache.tapestry5.annotations.ApplicationState;

import com.packtpub.celeb5.model.User;
import com.packtpub.celeb5.util.Security;

public class Index {
	private String userName;
    private String password; 
    
    @ApplicationState
    private User user;
    
    Object onSubmitFromLoginForm() {
        Class nextPage = null;
        User authenticatedUser = null;
        authenticatedUser = 
				Security.authenticate(userName, password);
        if (authenticatedUser != null) {
            user = authenticatedUser;
            nextPage = ShowAll.class;
        }
        else {
            nextPage = Registration.class;
        }
        return nextPage;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
