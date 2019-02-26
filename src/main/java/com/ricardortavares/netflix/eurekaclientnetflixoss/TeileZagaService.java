package com.ricardortavares.netflix.eurekaclientnetflixoss;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TeileZagaService {
	
	private final List<String> phrases = Arrays.asList("Quicada Lateral", "Passada de rainha de batera", "Teile e foi...");
	
	public String getPhrases() {
		Random random = new Random();
		
		int randomIdx = random.nextInt(phrases.size());
		
		return phrases.get(randomIdx);
	}

}
