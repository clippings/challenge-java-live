package com.dt.challenge;

import com.dt.challenge.repository.DocumentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CalculateCommand implements CommandLineRunner {

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
