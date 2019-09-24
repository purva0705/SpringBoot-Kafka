package com.infy.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.infy.kafka.service.KafkaSender;

import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class KafkaController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/producer")
	public String sendPatientData() {
		try {
			return kafkaSender.publishDataToKafka();
		} catch (Exception e) {
			System.err.println("Error occured" + e.getMessage());
		}

		return "Data published on kafka topic successfully";
	}

}
