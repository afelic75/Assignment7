package com.meritamerica.assignment7_v2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7_v2.models.CDAccount;


public interface CDAccountRepository extends JpaRepository<CDAccount, Long> {
	List<CDAccount> findByAccountHolder(long id);

}
