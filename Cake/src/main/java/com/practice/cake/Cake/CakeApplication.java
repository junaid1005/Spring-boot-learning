package com.practice.cake.Cake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeApplication implements CommandLineRunner {
	@Autowired
	private CakeBaker c1;

	public static void main(String[] args) {
		SpringApplication.run(CakeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		c1.bakeCake();
	}
}
