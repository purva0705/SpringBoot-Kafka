package com.infy.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infy.entity.Employee;
import com.infy.entity.Patient;

@Service
@KafkaListener(topics = "publisher", groupId = "group_json")
public class KafkaConsumerService {

	@Autowired
	 private RestTemplate restTemplate;
	
	@KafkaHandler
	public void consumePatientData(Patient patient) {
		
		Employee employee = restTemplate.getForObject("http://localhost:8100/employee/" +patient.getId(), Employee.class);
		
	}
}
