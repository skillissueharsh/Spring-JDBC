package com.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("l");
		alien1.setTech("java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());

	}

}
