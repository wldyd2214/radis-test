package com.example.radis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
		
		System.out.println("연결 시도");
		Jedis jedis = new Jedis("radis-test.0wchch.ng.0001.apn2.cache.amazonaws.com", 6379);
		System.out.println("연결 완료");
        jedis.set("users:jypark", "park ju yong|seoul|010-1234-1234");
        String value = jedis.get("users:jypark");
        System.out.println(value);
	}

}
