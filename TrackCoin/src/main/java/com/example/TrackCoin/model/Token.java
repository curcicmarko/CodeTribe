package com.example.TrackCoin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Token {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String symbol;

	@Column
	private double price;

	@Column
	private double quantity;


	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private User user;

	public Token() {

	}

	public Token(Token t) {
		this.id = t.getId();
		this.price = t.getPrice();
		this.symbol = t.getSymbol();
		this.quantity = t.getQuantity();

	}

	public Token(long id, String symbol, double price, double quantity, User user) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.price = price;
		this.quantity = quantity;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public double getValue() {
		return price*quantity;
	}
}
