//package com.example.TrackCoin;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.example.TrackCoin.model.Token;
//import com.example.TrackCoin.model.User;
//import com.example.TrackCoin.service.TokenService;
//import com.example.TrackCoin.service.UserService;
//
//@Component
//public class InitialData {
//
//	@Autowired
//	UserService userService;
//	
//	@Autowired
//	TokenService tokenService;
//
//	@PostConstruct
//	public void init() {
//		
//		User user1 = new User(0, null);
//		userService.save(user1);
//		
//		Token btc = new Token(0, "BTC", 43613.15, 4.6, user1);
//		tokenService.save(btc);
//		
//		Token eth = new Token(0, "ETH", 2953.2, 11, user1);
//		tokenService.save(eth);
//		
//		Token usdt = new Token(0, "USDT", 1, 12.2, user1);
//		tokenService.save(usdt);
//		
//		Token bnb = new Token(0, "BNB", 420.22, 3, user1);
//		tokenService.save(bnb);
//		
//		Token sol = new Token(0, "SOL", 102.12, 5, user1);
//		tokenService.save(sol);
//		
//		Token matic = new Token(0, "MATIC", 1.64, 25, user1);
//		tokenService.save(matic);
//		
//		
//
//	}
//
//}
