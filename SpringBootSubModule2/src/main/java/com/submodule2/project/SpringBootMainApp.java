package com.submodule2.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.submodule1.project.ServiceConfiguration;

@SpringBootApplication
@Import(ServiceConfiguration.class)
public class SpringBootMainApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMainApp.class, args);

	}

}
