package com.packtpub.celeb5.util;

import com.packtpub.celeb5.model.User;

public class Security {
	private static final String USERNAME = "user";
    private static final String PASSWORD = "secret";
    
    public static User authenticate(String userName, 
													String password) {
        if (USERNAME.equals(userName) && 
										PASSWORD.equals(password)) {
            return new User("John", "Smith");
        }
        return null;
    }
}
