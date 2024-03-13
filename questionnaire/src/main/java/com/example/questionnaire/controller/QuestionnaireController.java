package com.example.questionnaire.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.questionnaire.model.Questionnaire;
import com.example.questionnaire.service.QuestionnaireService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@RestController
public class QuestionnaireController {
	
	@Autowired
	QuestionnaireService questionnaireService;
	
	
	//Get API to retrieve question List
	
	@GetMapping("/api/questions")
	public List<Questionnaire> getQuestionList() throws StreamReadException, DatabindException, IOException {
		List<Questionnaire> questionList = questionnaireService.getQuestions();
		return questionList;
	}

}
