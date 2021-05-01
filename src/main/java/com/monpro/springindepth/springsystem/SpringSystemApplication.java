package com.monpro.springindepth.springsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringSystemApplication {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new RecommenderImplementation(new ContentBasedFilter()).recommendMovies("Live")));
		System.out.println(Arrays.toString(new RecommenderImplementation(new CollaborativeFilter()).recommendMovies("Live")));

//		SpringApplication.run(SpringSystemApplication.class, args);
	}

}
