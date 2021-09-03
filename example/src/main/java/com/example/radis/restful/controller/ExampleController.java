package com.example.radis.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.Jedis;

@RestController
public class ExampleController {
	
	@GetMapping("/radis")
	public String movieMain() {
		System.out.println("radis 연결 요청");
		Jedis jedis = new Jedis("radis-test.0wchch.ng.0001.apn2.cache.amazonaws.com", 6379);
		System.out.println("radis 연결 성공");
	    jedis.set("users:jypark", "park ju yong|seoul|010-1234-1234");
	    System.out.println("radis users:jypark KeySet 성공");
	    String value = jedis.get("users:jypark");
	    System.out.println("radis users:jypark KeyGet = " + value);
	    
		return "radis";
	}
}
