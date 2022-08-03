package hw10.project.currency;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CurrencyServiceImpl implements CurrencyService {

	private final Map<String, Currency> currencyMap;

	public CurrencyServiceImpl(final List<Currency> currencies) {

		currencyMap = currencies.stream()
			.collect(Collectors.toMap(Currency::getNameCurrency, Function.identity()));
	}

	@Override
	public Currency getCurrency(final String currency) {

		return currencyMap.get(currency);
	}
}
