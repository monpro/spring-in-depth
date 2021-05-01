package com.monpro.springindepth.springsystem;

import org.springframework.stereotype.Component;

@Component
class ContentBasedFilter implements Filter {
  public String[] getRecommendations(String movie) {
    //logic of content based filter
    return new String[] {"heat", "nicks"};
  }
}
