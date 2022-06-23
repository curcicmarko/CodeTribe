package com.example.TrackCoin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TrackCoin.model.User;
import com.example.TrackCoin.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	public Optional<User> findOne(Long id) {
		return userRepo.findById(id);
	}
	
	
	public User save(User user) {
		return userRepo.save(user);
	} 
}
