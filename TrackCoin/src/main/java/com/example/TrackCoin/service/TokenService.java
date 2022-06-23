package com.example.TrackCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TrackCoin.model.Token;
import com.example.TrackCoin.repository.TokenRepository;

@Service
public class TokenService {
	
	@Autowired
	TokenRepository tokenRepo;
	
	public List<Token> findAll() {
		return tokenRepo.findAll();
	}
	
	
	public Token save(Token token) {
		return tokenRepo.save(token);
	} 
	
}
