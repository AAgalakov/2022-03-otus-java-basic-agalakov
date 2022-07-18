package hw03;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestClass {

	private static final String RESULT = "Правильные ответы = %s\nНеправильные ответы = %s";
	private static final String MESSAGE_FOR_ANSWER = "Введите номер варианта ответа: ";
	private static final String ERROR_MESSAGE_NOT_NUMBER = "Необходимо ввести число\n";
	private static final String ERROR_MESSAGE_OUT_OF_ARRAY = "Граница числа от %d до %d\n";
	private static final int MIN_NUMBER_OF_ANSWER = 1;
	private int rightAnswers;
	private int wrongAnswers;

	public Map<String, Integer> doTest(final List<Question> questions) {

		final IOService ioService = new IOService();
		try (final Scanner in = new Scanner(System.in)) {
			for (final Question question : questions) {
				int numberOfAnswer;
				final int countOfAnswers = question.countOfAnswers();
				final int correctAnswerId = question.getCorrectAnswerId();
				do {
					ioService.printQuestion(question);
					printMessageForAnswer();
					final String answer = in.nextLine();
					numberOfAnswer = extractAnswer(countOfAnswers, answer);
				} while (isAnswerInvalid(numberOfAnswer, countOfAnswers));
				sumAnswers(numberOfAnswer, correctAnswerId);
				System.out.println();
			}
		}
		return Map.of(ResultAnswer.WRIGHT.name(), rightAnswers, ResultAnswer.WRONG.name(), wrongAnswers);
	}

	private int extractAnswer(final int countOfAnswers, final String answer) {

		int numberOfAnswer;
		try {
			numberOfAnswer = Integer.parseInt(answer);
		} catch (NumberFormatException e) {
			numberOfAnswer = 0;
			System.out.println(ERROR_MESSAGE_NOT_NUMBER);
		}
		if (numberOfAnswer < MIN_NUMBER_OF_ANSWER || numberOfAnswer > countOfAnswers) {
			System.out.printf(ERROR_MESSAGE_OUT_OF_ARRAY, MIN_NUMBER_OF_ANSWER, countOfAnswers);
		}
		return numberOfAnswer;
	}

	private void printMessageForAnswer() {

		System.out.print(MESSAGE_FOR_ANSWER);
	}

	private void sumAnswers(final int numberOfAnswer, final int idCorrectAnswer) {

		if (idCorrectAnswer == numberOfAnswer) {
			rightAnswers++;
		} else {
			wrongAnswers++;
		}
	}

	private boolean isAnswerInvalid(final int numberOfAnswer, final int countOfAnswers) {

		return numberOfAnswer < MIN_NUMBER_OF_ANSWER || numberOfAnswer > countOfAnswers;
	}
}
