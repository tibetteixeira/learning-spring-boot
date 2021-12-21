package io.github.tibetteixeira;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@Development
public class DevelopmentSettings {
    private static final Logger log = Logger.getLogger(DevelopmentSettings.class.getName());

    @Bean
    public CommandLineRunner run() {

        return args -> {
            log.info("Aplicação iniciada em ambiente de desenvolvimento.");
        };
    }

}
