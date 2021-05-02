package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {
  private static int instances = 0;

  public Movie() {
    super();
    instances++;
    System.out.println("movie constructor called");
  }

  public static int getInstances() {
    return Movie.instances;
  }

}