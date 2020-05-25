package com.meritamerica.assignment7_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7_v2.models.AccountHolderContactDetails;


public interface AccountHolderContactDetailsRepository extends JpaRepository<AccountHolderContactDetails, Long>{
	AccountHolderContactDetails findById(long id);
}
