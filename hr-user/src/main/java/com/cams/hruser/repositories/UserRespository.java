package com.cams.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cams.hruser.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
