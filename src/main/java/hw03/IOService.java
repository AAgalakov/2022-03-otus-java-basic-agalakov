package hw03;

import java.util.Map;

public class IOService {

	private static final String RESULT = "Правильные ответы = %d\nНеправильные ответы = %d";

	public void printQuestion(final Question question) {

		final StringBuilder builder = new StringBuilder();
		builder.append(question.getText());
		question.getAnswers().forEach(answer -> builder.append("\n").append(answer.text()));
		System.out.println(builder);
	}

	public void printResult(final Map<String, Integer> result) {

		System.out.printf(RESULT, result.get(ResultAnswer.WRIGHT.name()), ResultAnswer.WRONG.name());

	}
}
