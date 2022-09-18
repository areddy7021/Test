package com.uhc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uhc.model.Preferences;
import com.uhc.model.Security;
import com.uhc.repo.PreferencesRepository;
import com.uhc.repo.SecurityRepository;
import com.uhc.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uhc.service.KafkaSender;

import java.util.List;

@RestController
@RequestMapping(value = "/javainuse-kafka/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@Autowired
	private PreferencesRepository preferencesRepository;

	@Autowired
	private SecurityRepository securityRepository;

	@GetMapping(value = "/preferences/producer")
	public String preferencesProducer(@RequestParam("message") String message) throws JsonProcessingException {
		List<Preferences> listPreferences = preferencesRepository.getAllPreferences();
		for (Preferences preferences : listPreferences){
			ObjectMapper mapper = new ObjectMapper();
			Mapper.getMapping(preferences);
			kafkaSender.send(preferences.getId(), mapper.writeValueAsString(Mapper.getMapping(preferences)));
		}
		return "Message sent to the Kafka Topic NewTopic Successfully";
	}

	@GetMapping(value = "/security/producer")
	public String securityProducer(@RequestParam("message") String message) throws JsonProcessingException {
		List<Security> securityList = securityRepository.getAllSecurityList();
		for (Security security : securityList){
			ObjectMapper mapper = new ObjectMapper();
			kafkaSender.send(security.getConsumerNm(), mapper.writeValueAsString(security));
		}
		return "Message sent to the Kafka Topic NewTopic Successfully";
	}



}

