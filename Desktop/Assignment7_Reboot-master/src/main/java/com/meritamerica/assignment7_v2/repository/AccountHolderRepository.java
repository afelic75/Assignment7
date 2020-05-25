package com.meritamerica.assignment7_v2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7_v2.models.AccountHolder;



public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long> {
	AccountHolder findById(long id);
	

	
 	
	

}
