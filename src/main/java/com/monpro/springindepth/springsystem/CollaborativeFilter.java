package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("CLF")
public class CollaborativeFilter implements Filter {
  @Override
  public String[] getRecommendations(String movie) {
    return new String[]{"Lakers", "Cavaliers"};
  }
}
