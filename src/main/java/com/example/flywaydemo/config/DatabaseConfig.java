package com.example.flywaydemo.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    // Estratégia para apenas rodar as migrações (sem limpar)
    @Bean
    public FlywayMigrationStrategy migrateStrategy() {
        return flyway -> {
            flyway.migrate(); // aplica as migrações
        };
    }
}

