package com.example.TrackCoin.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Token> tokens = new HashSet<>();

	public User() {
		
	}
	public User(User u) {
		
		this.id = u.getId();
		this.tokens = u.getTokens();
	}
	public User(long id, Set<Token> tokens) {
		super();
		this.id = id;
		this.tokens = tokens;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Token> getTokens() {
		return tokens;
	}

	public void setTokens(Set<Token> tokens) {
		this.tokens = tokens;
	}

}
