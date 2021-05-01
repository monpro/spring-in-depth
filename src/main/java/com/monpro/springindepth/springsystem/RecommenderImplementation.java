package com.monpro.springindepth.springsystem;

class RecommenderImplementation {

  String[] recommendMovies(String movie) {
   ContentBasedFilter filter = new ContentBasedFilter();
    return filter.getRecommendations(movie);
  }
}
