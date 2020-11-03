package com.nintendo.Pikmin.Data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nintendo.Pikmin.Data.Models.Pikmin;

@Component
public class PikminRepository {

	private Pikmin redPikmin = new Pikmin();
	private Pikmin yellowPikmin = new Pikmin();
	private Pikmin bluePikmin = new Pikmin();
	private ArrayList<Pikmin> pikminList = new ArrayList<>();
	
	
	public List<Pikmin> getAllPikmin() {
		
		redPikmin.setType("Red");
		redPikmin.setStage("Flower");
		yellowPikmin.setType("Yellow");
		yellowPikmin.setStage("Bud");
		bluePikmin.setType("Blue");
		bluePikmin.setStage("Leaf");
		pikminList.add(redPikmin);
		pikminList.add(yellowPikmin);
		pikminList.add(bluePikmin);
		
		return pikminList;
	}
		
}
