package com.thomasvitale.demo;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	Function<String,String> uppercase() {
		return instrument -> {
			log.info("Converting {} to uppercase", instrument);
			return instrument.toUpperCase();
		};
	}

	Function<String,String> sentence() {
		return instrument -> {
			log.info("Building sentence with {}", instrument);
			return "I play the " + instrument;
		};
	}

}
