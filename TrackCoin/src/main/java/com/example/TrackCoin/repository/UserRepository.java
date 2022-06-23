package com.example.TrackCoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TrackCoin.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
