package com.nbmgroups.nbmlabrary.main.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nbmgroups.nbmlabrary.main.data.entities.UserSignUpInformation;

public interface UserInformationJPARepo extends JpaRepository<UserSignUpInformation, Integer> {
	
	@Query(value = "SELECT * FROM userinformationsignup u WHERE u.email_id = :emailid LIMIT 1", nativeQuery = true)
	UserSignUpInformation findUserByEmailId(@Param("emailid") String emailid);
	
	@Query(value = "SELECT * FROM userinformationsignup u WHERE u.email_id = :emailid and password = :password", nativeQuery = true)
	UserSignUpInformation findUserByEmailIdandPassword(@Param("emailid") String emailId, @Param("password") String password);
}
