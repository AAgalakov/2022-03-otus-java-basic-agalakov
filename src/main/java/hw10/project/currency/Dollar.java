package hw10.project.currency;

import java.util.Map;

public class Dollar implements Currency {

	private static final String DOL = "доллар";
	private final Map<Integer, String> integerStringMap;

	public Dollar() {

		integerStringMap = Map.of(
			1, "доллар",
			2, "доллара",
			3, "долларов"
		);
	}

	@Override
	public String getNameCurrency() {

		return DOL;
	}

	@Override
	public Map<Integer, String> getCurrencyMap() {

		return integerStringMap;
	}
}
