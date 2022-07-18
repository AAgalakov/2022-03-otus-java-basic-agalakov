package hw03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestOOP {

	public static void main(final String[] args) throws IllegalAccessError {

		final String[][] questions = {
			{"Вопрос, в котором верный вариант ответа - 1", "Вариант 1", "Вариант 1", "Вариант 2", "Вариант 3"},
			{"Вопрос, в котором верный вариант ответа - 2", "Вариант 2", "Вариант 1", "Вариант 2", "Вариант 3", "Вариант 4"},
			{"Вопрос, в котором верный вариант ответа - 3", "Вариант 3", "Вариант 1", "Вариант 2", "Вариант 3"}};

		final List<Question> collect = Arrays.stream(questions).map(Question::new).toList();
		final TestClass testClass = new TestClass();
		final Map<String, Integer> stringIntegerMap = testClass.doTest(collect);
		final IOService ioService = new IOService();
		ioService.printResult(stringIntegerMap);
	}
}
