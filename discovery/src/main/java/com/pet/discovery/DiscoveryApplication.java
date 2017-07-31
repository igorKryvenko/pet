package com.pet.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * Discovery service
 * @author Igor Kryvenko
 */
@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryApplication {
  public static void main(String[] args) {

    SpringApplicaiton.run(DiscoveryApplication.class);
  }
}
