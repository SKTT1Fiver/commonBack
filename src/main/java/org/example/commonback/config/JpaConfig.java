package org.example.commonback.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author SKTT1Fiver
 */
@Configuration
@EntityScan("org.example.commonback.entity")
@EnableJpaRepositories(basePackages = "org.example.commonback.repository")
public class JpaConfig {
}
