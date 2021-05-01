package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//1. The Component annotation tells spring to manage objects of RecommenderImplementation
@Component
class RecommenderImplementation {

  // use interface to select filter instead of hardcoded implementations
  // the Autowired annotation tells Spring that RecommenderImplementation needs an object of type Filter
  @Autowired
  private Filter filter;

  // in constructor we manually inject the implementation (DI)
  RecommenderImplementation(Filter filter) {
    super();
    this.filter = filter;
  }

  String[] recommendMovies(String movie) {
    System.out.println(filter);
    return filter.getRecommendations(movie);
  }
}
