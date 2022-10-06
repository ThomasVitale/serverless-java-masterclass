package com.thomasvitale.demo;

import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.cloud.function.context.test.FunctionalSpringBootTest;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.assertThat;

@FunctionalSpringBootTest
public class FunctionsTests {
    
    @Autowired
	private FunctionCatalog catalog;

	@Test
	void uppercase() {
		Function<Instrument, String> uppercase = catalog.lookup(Function.class, "uppercase");
		assertThat(uppercase.apply(new Instrument("piano"))).isEqualTo("PIANO");
	}

	@Test
	void sentence() {
		Function<Mono<String>,Mono<Skill>> sentence = catalog.lookup(Function.class, "sentence");

		StepVerifier.create(sentence.apply(Mono.just("PIANO")))
				.expectNextMatches(skill -> skill.equals(new Skill("I play the PIANO")))
				.verifyComplete();
	}

	@Test
	void uppercaseAndSentence() {
		Function<Mono<Instrument>,Mono<Skill>> uppercaseAndSentence = catalog.lookup(Function.class, "uppercase|sentence");
        
		StepVerifier.create(uppercaseAndSentence.apply(Mono.just(new Instrument("piano"))))
				.expectNextMatches(skill -> skill.equals(new Skill("I play the PIANO")))
				.verifyComplete();
	}
    
}
