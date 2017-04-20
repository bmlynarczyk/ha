package com.introsoft.service.registry;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableCloudDashboard
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "service-registry");
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
}
