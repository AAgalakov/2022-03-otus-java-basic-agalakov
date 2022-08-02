package hw10.project.printer;

import hw10.project.currency.Currency;

public class PrinterServiceImpl implements PrintService{

	private final PrintNumber printNumber = new PrintNumber();
	private final PrinterCurrencyName printerCurrencyName = new PrinterCurrencyName();
	private final Validation validation = new Validation();

	@Override
	public String convertToString(final Currency currency, final int amount) {
		validation.validate(amount);
		final String printPrice = printerCurrencyName.printPrice(currency, amount);
		return printNumber.numberToString(amount) + " " + printPrice;
	}
}
