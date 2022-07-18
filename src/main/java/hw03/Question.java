package hw03;

import java.util.HashSet;
import java.util.Set;

public class Question {

	private final String text;
	private final Set<Answer> answers;
	private int correctAnswerId;

	public Question(final String[] question) {

		this.text = question[0];
		answers = new HashSet<>();
		for (int i = 2; i < question.length; i++) {
			final int id = i - 1;
			answers.add(new Answer(id, question[i]));
			if (question[1].equals(question[i])) {
				this.correctAnswerId = id;
			}
		}
	}

	public int getCorrectAnswerId() {

		return correctAnswerId;
	}

	public int countOfAnswers() {

		return answers.size();
	}

	public String getText(){
		return text;
	}

	public Set<Answer> getAnswers(){
		return answers;
	}
}
