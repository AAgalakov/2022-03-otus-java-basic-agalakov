package hw10.project.printer;

import hw10.project.currency.Currency;

public class ConverterToWordImpl implements ConverterToWord {

	private final ConvertNumberToWord convertNumberToWord;
	private final CurrencyNameConverter currencyNameConverter;
	private final Validation validation;

	public ConverterToWordImpl(
		final ConvertNumberToWord convertNumberToWord,
		final CurrencyNameConverter currencyNameConverter,
		final Validation validation) {

		this.convertNumberToWord = convertNumberToWord;
		this.currencyNameConverter = currencyNameConverter;
		this.validation = validation;
	}

	@Override
	public String convertToString(final Currency currency, final int amount) {

		validation.validate(amount);
		final String printPrice = currencyNameConverter.convertCurrencyByAmount(currency, amount);
		return convertNumberToWord.numberToString(amount) + " " + printPrice;
	}
}
