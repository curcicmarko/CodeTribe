package com.example.TrackCoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TrackCoin.model.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
	

}
