package hw10.project.currency;

import java.util.Map;

public class Euro extends Currency{
	private final Map<Integer, String> integerStringMap;

	public Euro() {

		integerStringMap = Map.of(
			1, "евро",
			2, "евро",
			3, "евро"
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
