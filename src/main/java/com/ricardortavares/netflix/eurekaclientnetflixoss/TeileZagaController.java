package com.ricardortavares.netflix.eurekaclientnetflixoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeileZagaController {

	@Autowired
	private TeileZagaService service;
	
	@GetMapping("/phrases")
	public String getPhrases() {
		return service.getPhrases();
	}
}
