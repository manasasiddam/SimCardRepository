package com.sim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sim.entity.simCards;
import com.sim.repository.simCardRepository;

@Service
public class simServiceImpl implements simService {
	private simCardRepository simCardRepo;

	public simServiceImpl(simCardRepository simCardRepo) {
		super();
		this.simCardRepo = simCardRepo;
	}

	@Override
	public simCards addSim(simCards sims) {
		simCards saveSim = simCardRepo.save(sims);
		return saveSim;
	}

	
	
	@Override
	public List<simCards> getAllSimCards() {
		List<simCards> findAll = simCardRepo.findAll();
		return findAll;
	}

	@Override
	public simCards getSimCardById(Integer simId) {
		Optional<simCards> findById = simCardRepo.findById(simId);
		return findById.orElseThrow(null);
	}
	

	@Override
	public List<simCards> getSimCardsOfMobile(Integer mobileId) {
		List<simCards> simOfMobile = simCardRepo.findByMobileId(mobileId);
		return simOfMobile;
	}


}
