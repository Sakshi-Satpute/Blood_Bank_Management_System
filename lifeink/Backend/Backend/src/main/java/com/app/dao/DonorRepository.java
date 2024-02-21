package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Donor;

public interface DonorRepository extends JpaRepository<Donor, String>{
	
	Donor findByEmailAndPassword(String emailId, String password);
	
	@Query(value="select  d from Donor d where d.email=:email")
	Donor featchById(String email);
	
	 
}
