package com.monpro.springindepth.springsystem;


public class CollaborativeFilter implements Filter {
  @Override
  public String[] getRecommendations(String movie) {
    return new String[]{"Lakers", "Cavaliers"};
  }
}
