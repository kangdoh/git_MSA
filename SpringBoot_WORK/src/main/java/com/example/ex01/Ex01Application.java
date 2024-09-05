package com.example.ex01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Arrays;

@SpringBootApplication
@CrossOrigin

public class Ex01Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Ex01Application.class, args);
		Arrays.stream(
				applicationContext.getBeanDefinitionNames()
		)
						.forEach(System.out::println);
		SpringApplication.run(Ex01Application.class, args);
	}

}