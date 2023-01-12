package com.nbmgroups.nbmlabrary.main.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nbmgroups.nbmlabrary.main.data.entities.UserHobies;

@Repository
public interface UserHobiesJPARepo extends JpaRepository<UserHobies,Integer> {

}
