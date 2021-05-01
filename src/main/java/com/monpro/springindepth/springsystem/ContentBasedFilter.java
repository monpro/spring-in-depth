package com.monpro.springindepth.springsystem;

class ContentBasedFilter implements Filter {
  public String[] getRecommendations(String movie) {
    //logic of content based filter
    return new String[] {"heat", "nicks"};
  }
}
