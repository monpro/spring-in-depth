package com.monpro.springindepth.springsystem;

class RecommenderImplementation {

  // use interface to select filter instead of hardcoded implementations
  private Filter filter;

  // in constructor we manually inject the implementation (DI)
  RecommenderImplementation(Filter filter) {
    super();
    this.filter = filter;
  }

  String[] recommendMovies(String movie) {
    return filter.getRecommendations(movie);
  }
}
