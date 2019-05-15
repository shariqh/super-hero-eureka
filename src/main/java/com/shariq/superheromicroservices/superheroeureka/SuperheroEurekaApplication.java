package com.shariq.superheromicroservices.superheroeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SuperheroEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperheroEurekaApplication.class, args);
	}

}
