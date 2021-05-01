package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementationSetterInjection {

  private Filter filter;

  @Autowired
  @Qualifier("CLF")
  public void setFilter(Filter filter) {
    this.filter = filter;
    System.out.println("Setter method...");
  }

  String[] recommendMovies(String movie) {
    System.out.println(filter);
    return filter.getRecommendations(movie);
  }
}
