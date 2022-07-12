package com.dt.challenge;

import com.dt.challenge.repository.DocumentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculateCommand implements CommandLineRunner {
  private static final Logger log = LoggerFactory.getLogger(CalculateCommand.class);
  @Override
  public void run(String... args) throws Exception {

    // TODO:  implement calculate command here
    // and print the result
    log.warn("Calculate command not implemented!");
    log.info("The following documents are in the repository: " +
        new DocumentRepository().getAll().toString());
    System.exit(0);
  }
}
