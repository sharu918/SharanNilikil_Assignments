package assignment02.SpringCore;

import java.util.Map;

public class QuestionMap {
	private int QuestionId;
	private String Question;
	private Map<Integer, String> Answer1;
	
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Map<Integer, String> getAnswer1() {
		return Answer1;
	}
	public void setAnswer1(Map<Integer, String> answer1) {
		Answer1 = answer1;
	}
	
	public QuestionMap(int questionId, String question, Map<Integer, String> answer1) {
		super();
		QuestionId = questionId;
		Question = question;
		Answer1 = answer1;
	}
	
	public QuestionMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuestionMap [QuestionId=" + QuestionId + ", Question=" + Question + ", Answer1=" + Answer1 + "]";
	}
	
	
}
