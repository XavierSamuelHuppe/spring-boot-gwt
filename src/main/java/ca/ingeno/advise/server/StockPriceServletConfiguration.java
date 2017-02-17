package ca.ingeno.advise.server;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StockPriceServletConfiguration {

  @Bean
  public ServletRegistrationBean stockPriceService() {

    return new ServletRegistrationBean(new StockPriceServiceImpl(), "/advise/stockPrices");
  }
}
