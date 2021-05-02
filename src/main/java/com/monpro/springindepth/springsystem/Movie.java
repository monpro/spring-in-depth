package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
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
