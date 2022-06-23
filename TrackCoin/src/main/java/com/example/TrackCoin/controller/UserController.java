package com.example.TrackCoin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TrackCoin.model.User;
import com.example.TrackCoin.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userService.findAll();
	}

	@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getOneUser(@PathVariable Long id) {
		Optional<User> user = userService.findOne(id);

		if (!user.isPresent())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		User u = new User(user.get());
		return new ResponseEntity<>(u, HttpStatus.OK);
	}

}
