package hw10.project.printer;

import hw10.project.currency.Currency;

public interface ConverterToWord {

	String convertToString(final Currency currency, final int amount);
}
