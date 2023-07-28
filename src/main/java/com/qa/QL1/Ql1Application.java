package com.qa.QL1;

import com.qa.QL1.model.Hero;
import com.qa.QL1.practice.Calculator;
//import com.qa.QL1.repository.HeroRepositor;
//import com.qa.QL1.repository.HeroRepository;
import com.qa.QL1.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Ql1Application implements CommandLineRunner {

	@Autowired
	Calculator calc;
	@Autowired
	HeroRepository heroRepository;
	public static void main(String[] args) {

		SpringApplication.run(Ql1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		int result = calc.addition(3,4);
		System.out.println(result);
		List<Hero> heroes = heroRepository.findAll();
		for (Hero hero: heroes) {
			System.out.println(hero);
		}
	}
}
