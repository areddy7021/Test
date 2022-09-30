//package com.uhc.service;
//
//import com.uhc.schema.model.preferences.IndividualPreferenceSelection;
//import org.springframework.stereotype.Component;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@Component
//public class KafkaListener {
//
//	@org.springframework.kafka.annotation.KafkaListener(topics = "kaas.preferences.epmp", groupId = "local.group")
//	public void listen(String selection) throws JsonMappingException, JsonProcessingException {
//
//
//		System.out.println("*************");
//		System.out.println(selection);
//
//		ObjectMapper mapper = new ObjectMapper();
//		IndividualPreferenceSelection individualPreferenceSelection = mapper.readValue(selection, IndividualPreferenceSelection.class);
//		System.out.println(individualPreferenceSelection);
//	}
//
//}
