package com.monpro.springindepth.springsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

// SpringBootApplication = @Configure + @EnableAutoConfiguration + @ComponentScan
// 1.Configure: declares a class as the source for bean definitions
// 2.EnableAutoConfiguration: allows the application to add beans using classpath definitions
// 3.ComponentScan: directs Spring into search for components in the path specified(including subpackages)
@SpringBootApplication
public class SpringSystemApplication {

	public static void main(String[] args) {
		// spring application context create beans
		// instead of manually creating beans, we could pick it up from there and use it to call recommendMovies
		ApplicationContext applicationContext = SpringApplication.run(SpringSystemApplication.class, args);
		System.out.println(Arrays.toString(applicationContext.getBean(RecommenderImplementation.class).recommendMovies("Live")));

	}

}
