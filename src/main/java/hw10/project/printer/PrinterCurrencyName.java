package hw10.project.printer;

import hw10.project.currency.Currency;

import java.util.Map;

public class PrinterCurrencyName {

	public String printPrice(final Currency currency, final int price) {
		final Map<Integer, String> integerStringMap = currency.getCurrencyMap();
		final int ten = price % 100;
		if (ten > 10 && ten < 21) {
			return integerStringMap.get(3);
		}
		final int lastNumber = price % 10;
		if (lastNumber == 1) {
			return integerStringMap.get(1);
		}
		if (lastNumber > 1 && lastNumber < 5) {
			return integerStringMap.get(2);
		}
		return integerStringMap.get(3);
	}
}
