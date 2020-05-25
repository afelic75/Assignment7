package com.meritamerica.assignment7_v2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7_v2.models.SavingsAccount;


public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long>{
	List<SavingsAccount> findByAccountHolder(long id);

}
