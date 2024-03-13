package com.example.questionnaire;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.questionnaire.controller.QuestionnaireController;
import com.example.questionnaire.model.Questionnaire;
import com.example.questionnaire.service.QuestionnaireService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class QuestionnaireApplicationTests {

	@Mock
	QuestionnaireService questionnaireService;

	@InjectMocks
	QuestionnaireController questionnaireController;

	@Test
	void getQuestionListTest() throws StreamReadException, DatabindException, IOException {
		Questionnaire questionnaire = new Questionnaire();
		List<String> questionList = new ArrayList<>();
		questionnaire.setQuestionnaireTitle("Geography Questions");
		questionList.add("What is the capital of Cuba?");
		questionList.add("What is the capital of France?");
		questionList.add("What is the capital of Poland?");
		questionList.add("What is the capital of Germany?");
		questionnaire.setQuestionsText(questionList);
		List<Questionnaire> expectedQuestionList = new ArrayList<>();
		expectedQuestionList.add(questionnaire);
		when(questionnaireService.getQuestions()).thenReturn(expectedQuestionList);
		List<Questionnaire> actualQuestionList = questionnaireController.getQuestionList();
		assertEquals(expectedQuestionList, actualQuestionList);
	}

}
