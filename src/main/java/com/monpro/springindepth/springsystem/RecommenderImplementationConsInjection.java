package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementationConsInjection {
  private Filter filter;

  @Autowired
  public RecommenderImplementationConsInjection(@Qualifier("CLF") Filter filter) {
    super();
    this.filter = filter;
    System.out.println("Constructor ...");
  }

  String[] recommendMovies(String movie) {
    System.out.println(filter);
    return filter.getRecommendations(movie);
  }
}
