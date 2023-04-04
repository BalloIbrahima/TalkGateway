package com.talkhours.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	DiscoveryClientRouteDefinitionLocator routeDefinitionLocator(
		ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties properties){
		return new DiscoveryClientRouteDefinitionLocator(rdc, properties);
	}

}
