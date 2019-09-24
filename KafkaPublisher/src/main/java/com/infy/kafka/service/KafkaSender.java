package com.infy.kafka.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infy.entity.Patient;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, Patient> kafkaTemplate;

	public static final String KAFKA_TOPIC = "publisher";

	// read json file and convert to patient object
	public String publishDataToKafka() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		Patient patient = objectMapper.readValue(new File("PatientData.json"), Patient.class);
		kafkaTemplate.send(KAFKA_TOPIC, patient);
		return "Success";
	}
}
