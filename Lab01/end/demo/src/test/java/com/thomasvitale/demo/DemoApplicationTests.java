package com.thomasvitale.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired
	WebTestClient webTestClient;

	@Test
	void whenIstrumentThenReturnSkill() {
		webTestClient
			.get()
			.uri("/piano")
			.exchange()
			.expectStatus().isOk()
			.expectBody(String.class).isEqualTo("I play the PIANO");
	}

}
