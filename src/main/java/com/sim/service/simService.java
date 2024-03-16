package com.sim.service;

import java.util.List;


import com.sim.entity.simCards;

public interface simService {
public simCards addSim(simCards sims);
	
	public simCards getSimCardById(Integer simId);
	
	public List<simCards> getAllSimCards();
	
	
	List<simCards> getSimCardsOfMobile(Integer mobileId);
}
