package com.nbmgroups.nbmlabrary.main.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nbmgroups.nbmlabrary.main.data.entities.UserSignUpInformation;
import com.nbmgroups.nbmlabrary.main.data.repositories.UserInformationJPARepo;
import com.nbmgroups.nbmlabrary.main.manager.UserInformationServiceInterface;

@Service
public class UserInformationServiceImplementation implements UserInformationServiceInterface {

	@Autowired
	public UserInformationJPARepo userInformationJPARepo;
	
	@Override
	public boolean signup(UserSignUpInformation userSignUpInformation) {
		
		if(userSignUpInformation==null) 
			return false;
		else			
		userInformationJPARepo.save(userSignUpInformation);
		return true;
		
	}

	@Override
	public boolean userCheck(UserSignUpInformation userSignUpInformation) {
		
		if(userSignUpInformation==null) {
			return false;
		}
		else {			
			UserSignUpInformation u =userInformationJPARepo.findUserByEmailId(userSignUpInformation.getEmailId());
			if(u==null)
				return false;
		return true;
		
		}
	}

	@Override
	public UserSignUpInformation loginEmailIdPass(UserSignUpInformation userSignUpInformation) {
		
		UserSignUpInformation emptyUserSignUpInformation = new UserSignUpInformation();
		
					
			UserSignUpInformation userSignUpInformationoutput =userInformationJPARepo.findUserByEmailIdandPassword(
					userSignUpInformation.getEmailId(),userSignUpInformation.getPassword());
			if(userSignUpInformationoutput==null)
				return emptyUserSignUpInformation;
			return userSignUpInformationoutput;
	}

	@Override
	public UserSignUpInformation DeleteUserInformation(Integer userId,UserSignUpInformation userSignUpInformationCheck) {
		
		UserSignUpInformation emptyuserSignUpInformation= new UserSignUpInformation();
		boolean result=false;
		if(userId!=null) {
		userInformationJPARepo.deleteById(userId);
		result=true;
		}
		if(result==true) {
			return emptyuserSignUpInformation;
		}else {
			return userSignUpInformationCheck;
		}
	}

	@Override
	public UserSignUpInformation updatetheUserService(UserSignUpInformation userSignUpInformation) {
		
		UserSignUpInformation emptyUserSignUpInformation = new UserSignUpInformation();
	
		UserSignUpInformation userSignUpInformationoutput =userInformationJPARepo.findByUserID(
				userSignUpInformation.getUserId());
	
		
		if(userSignUpInformationoutput==null) {
			return emptyUserSignUpInformation;
		}
		else {
	
              userInformationJPARepo.updateuserinformationsignup(userSignUpInformation.getUserId() ,
					userSignUpInformation.getDateOfBirth(),userSignUpInformation.getDistrict(),
					userSignUpInformation.getEmailId(),userSignUpInformation.getFirstName(),userSignUpInformation.getGender(),
					userSignUpInformation.getLastName(),userSignUpInformation.getMobileNumber(),
					userSignUpInformation.getNationality(),userSignUpInformation.getPassword(),userSignUpInformation.getState(),
					userSignUpInformation.getTaluka(),userSignUpInformation.getAddress(),
					userSignUpInformation.getPinCode(),userSignUpInformation.getBloodGrp(),
					userSignUpInformation.getReligion()
					);
              

              return userSignUpInformationoutput;
			}
			
			
		
		
		
		
	}

	
}
