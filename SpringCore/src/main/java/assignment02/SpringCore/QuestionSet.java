package assignment02.SpringCore;

import java.util.Set;

public class QuestionSet {
	private int QuestionId;
	private String Question;
	private Set<String> Answer;
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
	public Set<String> getAnswer() {
		return Answer;
	}
	public void setAnswer(Set<String> answer) {
		Answer = answer;
	}
	
	
	public QuestionSet(int questionId, String question, Set<String> answer) {
		super();
		QuestionId = questionId;
		Question = question;
		Answer = answer;
	}
	
	public QuestionSet() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "QuestionSet [QuestionId=" + QuestionId + ", Question=" + Question + ", Answer=" + Answer + "]";
	}
}