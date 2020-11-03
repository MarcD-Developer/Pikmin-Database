package com.nintendo.Pikmin.Logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nintendo.Pikmin.Data.PikminRepository;
import com.nintendo.Pikmin.Data.Models.Pikmin;

@Component
public class PikminLogic {

	@Autowired
	PikminRepository pikminRepo;
	
	public List<Pikmin> getAllPikmin() {
		
		return pikminRepo.getAllPikmin();
	}
	
}
