package com.example.questionnaire.model;

import java.util.List;

public class Questionnaire {

	private String questionnaireTitle;
	private List<String> questionsText;
	
	public String getQuestionnaireTitle() {
		return questionnaireTitle;
	}
	public void setQuestionnaireTitle(String questionnaireTitle) {
		this.questionnaireTitle = questionnaireTitle;
	}
	public List<String> getQuestionsText() {
		return questionsText;
	}
	public void setQuestionsText(List<String> questionsText) {
		this.questionsText = questionsText;
	}
	
	
}
