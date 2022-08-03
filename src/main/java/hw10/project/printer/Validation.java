package hw10.project.printer;

public class Validation {

	private static final int MAX_VALUE = 999;

	public void validate(final int price) {

		if (price < 0) {
			throw new IllegalArgumentException("Должно быть положительным");
		}
		if (price > MAX_VALUE) {
			throw new IllegalArgumentException("Должно быть меньше 1000");
		}
	}
}
