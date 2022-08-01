package hw10.project.currency;

import java.util.Map;

public class Dollar extends Currency{
	private static final String DOL = "доллар";
	private final Map<Integer, String> integerStringMap;

	public Dollar() {

		integerStringMap = Map.of(
			1, "доллар",
			2, "доллара",
			3, "долларов"
		);
	}

//	@Override
//	public String getFullName() {
//
//		return DOL;
//	}

	@Override
	public String getNameCurrency() {

		return DOL;
	}

	@Override
	public Map<Integer, String> getCurrencyMap() {

		return integerStringMap;
	}

//	@Override
//	public String printPrice(final int price) {
//
//		final int ten = price % 100;
//		if (ten > 10 && ten < 21) {
//			return DOL + integerStringMap.get(3);
//		}
//		final int lastNumber = price % 10;
//		if (lastNumber == 1) {
//			return DOL + integerStringMap.get(1);
//		}
//		if (lastNumber > 1 && lastNumber < 5) {
//			return DOL + integerStringMap.get(2);
//		}
//		return DOL + integerStringMap.get(3);
//	}
}
