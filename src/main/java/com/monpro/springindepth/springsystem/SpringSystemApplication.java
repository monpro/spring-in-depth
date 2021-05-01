package com.monpro.springindepth.springsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] result = recommender.recommendMovies("Live");
		System.out.println(Arrays.toString(result));
//		SpringApplication.run(SpringSystemApplication.class, args);
	}

}
