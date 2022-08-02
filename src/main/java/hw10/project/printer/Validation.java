package hw10.project.printer;

public class Validation {

	public void validate(final int price){
		if (price < 0){
			throw new IllegalArgumentException("Должно быть положительным");
		}
		if (price > 999){
			throw new IllegalArgumentException("Должно быть меньше 1000");
		}
	}
}
