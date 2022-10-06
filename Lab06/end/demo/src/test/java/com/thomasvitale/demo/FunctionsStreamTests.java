package com.thomasvitale.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.binder.test.InputDestination;
import org.springframework.cloud.stream.binder.test.OutputDestination;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.jupiter.api.Test;

@SpringBootTest
@Import(TestChannelBinderConfiguration.class)
public class FunctionsStreamTests {
    
    @Autowired
	private InputDestination input;

	@Autowired
	private OutputDestination output;

	@Autowired
	private ObjectMapper objectMapper;

    @Test
	void whenInstrumentThenReturnSkill() throws IOException {
		Message<Instrument> inputMessage = MessageBuilder
				.withPayload(new Instrument("piano")).build();
		Message<Skill> expectedOutputMessage = MessageBuilder
				.withPayload(new Skill("I play the PIANO")).build();

		this.input.send(inputMessage);

		assertThat(objectMapper.readValue(output.receive().getPayload(), Skill.class))
				.isEqualTo(expectedOutputMessage.getPayload());
	}

}
