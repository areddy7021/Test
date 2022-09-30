package com.uhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;


	public void sendMessage(String id , String data, String topicName) {
		kafkaTemplate.send(topicName, id , data);
	}
}
