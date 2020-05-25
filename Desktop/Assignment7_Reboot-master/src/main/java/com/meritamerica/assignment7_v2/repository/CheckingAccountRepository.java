package com.meritamerica.assignment7_v2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7_v2.models.CheckingAccount;




public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long>{
	List<CheckingAccount> findByAccountHolder(long id);

}
