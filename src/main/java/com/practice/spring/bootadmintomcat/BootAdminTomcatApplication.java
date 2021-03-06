package com.practice.spring.bootadmintomcat;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAdminServer
public class BootAdminTomcatApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootAdminTomcatApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootAdminTomcatApplication.class, args);
	}

}
