/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanplayer.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author oskarsanchez-chagollan
 */
public class UserAccount {
    private boolean loggedIn = false;

    public UserAccount() {
        
    }
    
    
    

    public void setLoggedIn(boolean state) {
        loggedIn = state;
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }

    public boolean isValidUsername(String userName) {
        String expression = "^[a-zA-Z][a-zA-Z0-9]{2,15}$";
        CharSequence inputStr = userName;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();

    }

    public boolean isValidPassword(String password) {
        String expression = "^\\w*(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z])\\w{6,11}$";
        CharSequence inputStr = password;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

    
}
