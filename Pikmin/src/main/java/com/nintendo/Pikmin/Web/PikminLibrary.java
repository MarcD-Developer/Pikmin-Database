package com.nintendo.Pikmin.Web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nintendo.Pikmin.Data.Models.Pikmin;
import com.nintendo.Pikmin.Logic.PikminLogic;

@RestController
public class PikminLibrary {

	
	@Autowired
	PikminLogic pikminLogic;
	

	@RequestMapping("/")
	public String index() {
		
		return "Localhost is running";
	}
	
	
	@RequestMapping("/getPikminList")
	public List<Pikmin> getPikminList() {
		
		List<Pikmin> returnedPikmin = pikminLogic.getAllPikmin();
		
		return returnedPikmin;
	}
}
