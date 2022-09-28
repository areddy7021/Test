package com.uhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value("${topic.name}")
	private String topicName;

	public void send(String id , String data) {
		kafkaTemplate.send(topicName, id , data);
	}
}
