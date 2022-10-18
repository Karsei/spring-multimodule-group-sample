package kr.pe.karsei.bookstore.api.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MyDomainApiConfiguration {
    @Bean
    public String thisIsApi() {
        log.info("Loaded api");
        return "ok";
    }
}
