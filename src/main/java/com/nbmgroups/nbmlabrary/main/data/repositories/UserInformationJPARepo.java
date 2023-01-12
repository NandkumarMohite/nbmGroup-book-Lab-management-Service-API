package com.nbmgroups.nbmlabrary.main.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nbmgroups.nbmlabrary.main.data.entities.UserSignUpInformation;

import jakarta.transaction.Transactional;

public interface UserInformationJPARepo extends JpaRepository<UserSignUpInformation, Integer> {
	
	@Query(value = "SELECT * FROM userinformationsignup u WHERE u.email_id = :emailid LIMIT 1", nativeQuery = true)
	UserSignUpInformation findUserByEmailId(@Param("emailid") String emailid);
	
	@Query(value = "SELECT * FROM userinformationsignup u WHERE u.email_id = :emailid and password = :password", nativeQuery = true)
	UserSignUpInformation findUserByEmailIdandPassword(@Param("emailid") String emailId, @Param("password") String password);

	@Query(value = "SELECT * FROM userinformationsignup u WHERE u.user_id = :userid LIMIT 1", nativeQuery = true)
	UserSignUpInformation findByUserID(@Param("userid") Integer userId);
	
	@Modifying
	@Transactional
	@Query
	(value = "Update userinformationsignup u Set u.date_of_birth= :date_of_birth,"
			+ "u.district= :district,"
			+ "u.email_id= :email_id,"
			+ "u.first_name= :first_name,"
			+ "u.gender= :gender,"
			+ "u.last_name= :last_name,"
			+ "u.mobile_number= :mobile_number,"
			+ "u.nationality= :nationality,"
			+ "u.password= :password,"
			+ "u.state= :state,"
			+ "u.taluka= :taluka,"
			+ "u.address= :address,"
			+ "u.pin_code= :pin_code,"
			+ "u.blood_grp= :blood_grp,"
			+ "u.religion= :religion Where u.user_id= :userid", nativeQuery = true)
	void updateuserinformationsignup(@Param("userid") Integer userId,
												@Param("date_of_birth") String date_of_birth,
												@Param("district") String district,
												@Param("email_id") String email_id,
												@Param("first_name") String first_name,
												@Param("gender") String gender,
												@Param("last_name") String last_name,
												@Param("mobile_number") String mobile_number,
												@Param("nationality") String nationality,
												@Param("password") String password,
												@Param("state") String state,
												@Param("taluka") String taluka,
												@Param("address") String address,
												@Param("pin_code") String pin_code,
												@Param("blood_grp") String blood_grp,
												@Param("religion") String religion
												);
	
}
