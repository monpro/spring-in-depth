package com.monpro.springindepth.springsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ContentBasedFilter implements Filter {

  @Autowired
  private Movie movie;

  public ContentBasedFilter(Movie movie){
    super();
    this.movie = movie;
    System.out.println("ContentBasedFilter constructor has been called");
  }

  public String[] getRecommendations(String movie) {
    //logic of content based filter
    return new String[] {"heat", "nicks"};
  }

  public Movie getMovie() {
    return movie;
  }

}
