package hw10.project.printer;

import hw10.project.currency.Currency;

public class PrinterServiceImpl implements PrintService{

	private final PrintNumber printNumber = new PrintNumber();
	private final PrinterCurrencyName printerCurrencyName = new PrinterCurrencyName();

	@Override
	public String print(final Currency currency, final int amount) {

		final String printPrice = printerCurrencyName.printPrice(currency, amount);
		return printNumber.numberToString(amount) + " " + printPrice;
	}
}
