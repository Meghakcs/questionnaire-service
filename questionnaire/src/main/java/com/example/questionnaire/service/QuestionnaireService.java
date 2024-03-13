package com.example.questionnaire.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.example.questionnaire.model.Questionnaire;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class QuestionnaireService {
	
	private final ResourceLoader resourceLoader;
	
	public QuestionnaireService(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	//Logic to read the data from JSON File
	public List<Questionnaire> getQuestions() throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub
		Resource resource = resourceLoader.getResource("classpath:questions.json");
		ObjectMapper objectMapper = new ObjectMapper();
		List<Questionnaire> questions = Arrays.asList(objectMapper.readValue(resource.getInputStream(), Questionnaire[].class));
		return questions;
	}

}
