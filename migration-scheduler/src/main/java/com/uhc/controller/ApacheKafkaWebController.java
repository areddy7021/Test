package com.uhc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uhc.model.Eligibility;
import com.uhc.model.Preferences;
import com.uhc.model.Security;
import com.uhc.repo.EligibilityRepository;
import com.uhc.repo.PreferencesRepository;
import com.uhc.repo.SecurityRepository;
import com.uhc.schema.model.preferences.IndividualPreferenceSelection;
import com.uhc.schema.model.security.ConsumerRolePermission;
import com.uhc.utils.AvroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uhc.service.KafkaSender;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "/javainuse-kafka/")
public class ApacheKafkaWebController {

	@Autowired
	private KafkaSender kafkaSender;

	@Autowired
	private PreferencesRepository preferencesRepository;

	@Autowired
	private SecurityRepository securityRepository;
	
	@Autowired
	private EligibilityRepository eligibilityRepository;
	
	@Value("${topic.name}")
	private String securityTopicName;
	
	@Value("${topic.name}")
	private String preferencesTopicName;
	
	@Value("${topic.name}")
	private String eligibilityTopicName;
	
	

	@GetMapping(value = "/preferences/producer")
	public String preferencesProducer(@RequestParam("message") String message) throws JsonProcessingException, ParseException {
		List<Preferences> listPreferences = preferencesRepository.getAllPreferences();
		for (Preferences preferences : listPreferences){

			IndividualPreferenceSelection individualPreferenceSelection = AvroMapper.getPreferencesMapping(preferences);
			kafkaSender.sendMessage(preferences.getId(), individualPreferenceSelection.toString(), preferencesTopicName);
			
		}
		return "Message sent to the Kafka Topic NewTopic Successfully";
	}

	@GetMapping(value = "/security/producer")
	public String securityProducer(@RequestParam("message") String message) throws JsonProcessingException {
		List<Security> securityList = securityRepository.getAllSecurityList();
		for (Security security : securityList){ 
			
			ConsumerRolePermission rolePermission = AvroMapper.getSecurityMapping(security);
			kafkaSender.sendMessage(security.getConsumerNm(), rolePermission.toString(), securityTopicName);
			
		}
		return "Message sent to the Kafka Topic NewTopic Successfully";
	}

	@GetMapping(value = "/eligibility/producer")
	public String eligibilityProducer(@RequestParam("message") String message) throws JsonProcessingException {
		List<Eligibility> eligibilityList = eligibilityRepository.getAllEligibilityList();
		
		for (Eligibility eligibility : eligibilityList){

			com.uhc.schema.model.eligibility.Eligibility eligibilityAvro = AvroMapper.getEligibilityMapping(eligibility);
			kafkaSender.sendMessage(eligibility.getIndividualId(), eligibilityAvro.toString(), eligibilityTopicName);

		}
		return "Message sent to the Kafka Topic NewTopic Successfully";
	}


}

