package com.sim.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sim.entity.simCards;
import com.sim.service.simService;

@RestController
@RequestMapping("/sim")
public class simController {

	private simService simservice;

	public simController(simService simservice) {
		super();
		this.simservice = simservice;
	}

	@PostMapping("/add")
	public ResponseEntity<simCards> savePlan(@RequestBody simCards sims) {
		simCards addSim = simservice.addSim(sims);
		return new ResponseEntity<>(addSim, HttpStatus.CREATED);

	}
	@GetMapping("/sim/{simId}")
	public ResponseEntity<simCards> findSimCardsById(@PathVariable Integer simId) {
		simCards simCardById =simservice.getSimCardById(simId);

		return new ResponseEntity<>(simCardById, HttpStatus.OK);

	}

//get all simCards of a specific mobile
	@GetMapping("/mobile/{mobileId}")

	public ResponseEntity<List<simCards>> findSimCardsOfEmployee(@PathVariable Integer mobileId) {
	 List<simCards> simCardsOfMobile = simservice.getSimCardsOfMobile(mobileId);
		return new ResponseEntity<>(simCardsOfMobile, HttpStatus.OK);

	}
		@GetMapping("/all")
		public ResponseEntity<List<simCards>> findAllsimCards(){
			
			List<simCards> allSimCards = simservice.getAllSimCards();
			return new ResponseEntity<>(allSimCards,HttpStatus.OK);
	}

}
