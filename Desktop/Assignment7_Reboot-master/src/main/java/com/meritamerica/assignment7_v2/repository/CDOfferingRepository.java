package com.meritamerica.assignment7_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7_v2.models.CDOffering;


public interface CDOfferingRepository extends JpaRepository<CDOffering, Long>{

	CDOffering findById(long id);
}
