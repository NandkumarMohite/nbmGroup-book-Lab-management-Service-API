package com.nbmgroups.nbmlabrary.main.manager;

import com.nbmgroups.nbmlabrary.main.data.entities.UserSignUpInformation;

public interface UserInformationServiceInterface {

	
	
	boolean signup(UserSignUpInformation userSignUpInformation);

	boolean userCheck(UserSignUpInformation userSignUpInformation);

	UserSignUpInformation loginEmailIdPass(UserSignUpInformation userSignUpInformation);

	UserSignUpInformation DeleteUserInformation(Integer userId, UserSignUpInformation userSignUpInformationCheck);

	UserSignUpInformation updatetheUserService(UserSignUpInformation userSignUpInformation);
	
}
