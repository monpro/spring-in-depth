package com.monpro.springindepth.springsystemalternative;

import com.monpro.springindepth.springsystem.Filter;
import org.springframework.stereotype.Component;

@Component
public class HybridFilter implements Filter {
  @Override
  public String[] getRecommendations(String movie) {
    return new String[]{"Nets", "Clippers"};
  }
}
