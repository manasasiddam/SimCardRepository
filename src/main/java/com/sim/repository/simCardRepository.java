package com.sim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sim.entity.simCards;

public interface simCardRepository extends JpaRepository<simCards, Integer> {
	List<simCards> findByMobileId(Integer mobileId);
}
