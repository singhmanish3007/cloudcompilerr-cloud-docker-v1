package com.cloudcompilerr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class GatewayApplication {

    public static void main(String[] args) {
	SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler() {
	return new AlwaysSampler();
    }

}
