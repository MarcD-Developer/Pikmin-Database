package com.nintendo.Pikmin.Web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PikminLibrary {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Pikmin!";
	}
}
