
package de.tarent.springexamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinimalApplication {

    private static final Logger log = LoggerFactory.getLogger(MinimalApplication.class);

    public static void main(String[] args) {
        log.info("Starting application...");
        SpringApplication.run(MinimalApplication.class, args);
    }
}