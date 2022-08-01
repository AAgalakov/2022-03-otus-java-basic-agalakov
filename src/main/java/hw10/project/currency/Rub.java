package hw10.project.currency;

import java.util.Map;

public class Rub extends Currency {

	private final Map<Integer, String> integerStringMap;

	public Rub() {

		integerStringMap = Map.of(
			1, "рубль",
			2, "рубля",
			3, "рублей"
		);
	}

	@Override
	public String getNameCurrency() {

		return integerStringMap.get(1);
	}

	@Override
	public Map<Integer, String> getCurrencyMap() {

		return integerStringMap;
	}
}
