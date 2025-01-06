package com.rssoftware.intelliedge.online.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
		"com.rssoftware.intelliedge.common.expr.parser",
		"com.rssoftware.intelliedge.online.apigateway.endpoint",
		"com.rssoftware.intelliedge.online.apigateway.transformation.impl",
		"com.rssoftware.intelliedge.online.apigateway.service.impl",
		"com.rssoftware.intelliedge.online.apigateway.response.creator"})
//@Import(ServiceContext.class)
@Slf4j
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(Application.class, args);

		log.info("Application Started:{}", configurableApplicationContext);
	}


	/**
	 * @param args agrument
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {
        log.info("Inside run:");
    }
}
