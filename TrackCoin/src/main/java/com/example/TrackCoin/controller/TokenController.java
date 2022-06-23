package com.example.TrackCoin.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TrackCoin.model.Token;
import com.example.TrackCoin.service.TokenService;

@RestController
@CrossOrigin("*")
public class TokenController {

	
	@Autowired
	TokenService tokenService;

	@GetMapping(value = "/tokens")
	public List<Token> getTokens() {
		List<Token> l = tokenService.findAll();
		return l.stream().sorted(Comparator.comparingDouble((Token::getValue)).reversed()).collect(Collectors.toList());
		
	
	}
}
