package hw10.project.currency;

import java.util.Map;

public class CurrencyServiceImpl implements CurrencyService {

	private final Map<String, Currency> currencyMap;

	public CurrencyServiceImpl() {

		final Rub rub = new Rub();
		final Dollar dollar = new Dollar();
		final Euro euro = new Euro();
		currencyMap = Map.of(
			rub.getNameCurrency(), rub,
			dollar.getNameCurrency(), dollar,
			euro.getNameCurrency(), euro
		);
	}

	@Override
	public Map<String, Currency> getCurrencyMap() {
		return currencyMap;
	}
}
