package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//1. The Component annotation tells spring to manage objects of RecommenderImplementation
@Component
class RecommenderImplementation {

  // Field injection, it is unsafe and could be inconvenient when do testing
  @Autowired
  @Qualifier("CBF")
  private Filter filter;

  String[] recommendMovies(String movie) {
    System.out.println(filter);
    return filter.getRecommendations(movie);
  }
}
