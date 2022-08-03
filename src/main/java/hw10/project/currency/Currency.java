package hw10.project.currency;

import java.util.Map;

public interface Currency {

	String getNameCurrency();

	Map<Integer, String> getCurrencyMap();

	default String getString(int price) {

		final int ten = price % 100;
		if (ten > 10 && ten < 21) {
			return getCurrencyMap().get(3);
		}
		final int lastNumber = price % 10;
		if (lastNumber == 1) {
			return getCurrencyMap().get(1);
		}
		if (lastNumber > 1 && lastNumber < 5) {
			return getCurrencyMap().get(2);
		}
		return getCurrencyMap().get(3);
	}
}
