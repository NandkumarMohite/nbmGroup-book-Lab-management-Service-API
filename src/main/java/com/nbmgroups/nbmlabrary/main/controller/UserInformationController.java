package com.nbmgroups.nbmlabrary.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nbmgroups.nbmlabrary.main.data.entities.UserSignUpInformation;
import com.nbmgroups.nbmlabrary.main.manager.UserInformationServiceInterface;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserInformationController {
	
	@Autowired
	public UserInformationServiceInterface userInformationServiceInterface;
	
	@PostMapping(value = "/signup")
	public String signupController(@RequestBody UserSignUpInformation userSignUpInformation) {
		
		boolean usercheck =userInformationServiceInterface.userCheck(userSignUpInformation);
		if(usercheck==true) {
			String p="{\"Output\":";
		String q="\"Already have account\"}";
			return p+q;
		}
		else {
		boolean result = userInformationServiceInterface.signup(userSignUpInformation);
		if(result==true) {
			String p="{\"Output\":";
			String d="\"Sign Up Succesfull\"}";
			return p+d;
		}
		else
			return "Something went Wrong Try Again";
		}
	}
	
	@PostMapping(value = "/findingtheuser")
	public UserSignUpInformation LoginController(@RequestBody UserSignUpInformation userSignUpInformation) {
		
		return userInformationServiceInterface.loginEmailIdPass(userSignUpInformation);
		
	}
	
	@PostMapping(value = "/deleteuser")
	public UserSignUpInformation DeleteUserController(@RequestBody UserSignUpInformation userSignUpInformation) {
		
		UserSignUpInformation userSignUpInformationCheck=userInformationServiceInterface.loginEmailIdPass(userSignUpInformation);
		
			
			return userInformationServiceInterface.DeleteUserInformation(userSignUpInformationCheck.getUserId(),userSignUpInformationCheck);
	
	}

}
