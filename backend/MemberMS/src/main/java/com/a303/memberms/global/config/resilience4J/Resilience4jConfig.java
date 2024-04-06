package com.a303.memberms.global.config.resilience4J;

import static io.github.resilience4j.circuitbreaker.CircuitBreakerConfig.SlidingWindowType.COUNT_BASED;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig.SlidingWindowType;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import java.time.Duration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Resilience4jConfig {


    @Bean
    public CircuitBreaker circuitBreaker(CircuitBreakerRegistry circuitBreakerRegistry) {
        return circuitBreakerRegistry.circuitBreaker(
                "customCircuitBreaker",
                CircuitBreakerConfig.custom()
                        .failureRateThreshold(50)
                        .slowCallRateThreshold(50)
                        .slowCallDurationThreshold(Duration.ofSeconds(3))
                        .permittedNumberOfCallsInHalfOpenState(3)
                        .maxWaitDurationInHalfOpenState(Duration.ofSeconds(3))
                        .slidingWindowType(COUNT_BASED)
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(2)
                        .waitDurationInOpenState(Duration.ofSeconds(1))
                        .build()
        );
    }
}