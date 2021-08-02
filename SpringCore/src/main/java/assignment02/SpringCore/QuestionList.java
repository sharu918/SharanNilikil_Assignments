package assignment02.SpringCore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionList {
	private int QuestionId;
	private String Question;
	private List<String> Answer;
	
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
	public List<String> getAnswer() {
		return Answer;
	}
	public void setAnswer(List<String> answer) {
		Answer = answer;
	}
	
	
	public QuestionList(int questionId, String question, List<String> answer, Set<String> answers,
			Map<String, String> ans) {
		super();
		QuestionId = questionId;
		Question = question;
		Answer = answer;
	}
	public QuestionList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuestionList [QuestionId=" + QuestionId + ", Question=" + Question + ", Answer=" + Answer + "]";
	}
	
}
