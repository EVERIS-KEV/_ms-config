package com.everis.configserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@Slf4j
@EnableConfigServer
@SpringBootApplication
public class MsConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsConfigServerApplication.class, args);
    log.info("SERVER CONFIG ENABLED");
  }
}
