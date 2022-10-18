package kr.pe.karsei.bookstore.batch.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MyDomainBatchConfiguration {
    @Bean
    public String thisIsBatch() {
        log.info("Loaded batch");
        return "ok";
    }
}
