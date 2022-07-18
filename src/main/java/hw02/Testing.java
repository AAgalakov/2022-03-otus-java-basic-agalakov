package hw02;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {

		int countRightAnswers = 0;
		int countWrongAnswers = 0;
		try (final Scanner in = new Scanner(System.in)) {
			final String[][] questions = {
				{"Вопрос, в котором верный вариант ответа - 1", "Вариант 1", "Вариант 1", "Вариант 2", "Вариант 3"},
				{"Вопрос, в котором верный вариант ответа - 2", "Вариант 2", "Вариант 1", "Вариант 2", "Вариант 3", "Вариант 4"},
				{"Вопрос, в котором верный вариант ответа - 3", "Вариант 3", "Вариант 1", "Вариант 2", "Вариант 3"}};
			for (final String[] question : questions) {
				int numberOfAnswer;
				final String correctAnswer = question[1];
				final int maxNumberOfAnswer = question.length - 2;
				do {
					for (int i = 0; i < question.length; i++) {
						if (i == 1) {
							continue;
						}
						System.out.println(question[i]);
					}
					System.out.print("Введите номер варианта ответа: ");
					final String answer = in.nextLine();
					try {
						numberOfAnswer = Integer.parseInt(answer);
					} catch (NumberFormatException e) {
						numberOfAnswer = 0;
						System.out.println("Необходимо ввести число\n");
					}
					if (numberOfAnswer < 1 || numberOfAnswer > maxNumberOfAnswer) {
						System.out.printf("Граница числа от %d до %d\n", 1, maxNumberOfAnswer);
					}
				} while (numberOfAnswer < 1 || numberOfAnswer > maxNumberOfAnswer);

				if (correctAnswer.equals(question[numberOfAnswer + 1])) {
					countRightAnswers++;
				} else {
					countWrongAnswers++;
				}
				System.out.println();
			}
		}
		System.out.printf("Правильные ответы = %s\nНеправильные ответы = %s", countRightAnswers, countWrongAnswers);
	}
}
