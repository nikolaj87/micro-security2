package com.nik.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;

@Configuration
public class GatewayConfig {

//    @Autowired
//    private ReactiveOAuth2AuthorizedClientService oAuth2AuthorizedClientService;

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(predicateSpec -> predicateSpec.path("/hello")
                        .filters(GatewayFilterSpec::tokenRelay)
                        .uri("lb://RESOURCE-SERVER"))
                .build();
    }
}