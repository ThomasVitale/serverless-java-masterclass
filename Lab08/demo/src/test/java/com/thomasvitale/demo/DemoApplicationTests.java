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
	void whenInstrumentThenReturnSkill() {
		var expectedSkill = new Skill("I play the PIANO");
		webTestClient
				.post()
				.bodyValue(new Instrument("piano"))
				.exchange()
				.expectStatus().isOk()
				.expectBody(Skill.class).isEqualTo(expectedSkill);
	}

}
