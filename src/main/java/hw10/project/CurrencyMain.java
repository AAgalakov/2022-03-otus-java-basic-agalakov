package hw10.project;

import hw10.project.currency.CurrencyServiceImpl;
import hw10.project.currency.Dollar;
import hw10.project.currency.Euro;
import hw10.project.currency.Rub;
import hw10.project.printer.ConvertNumberToWord;
import hw10.project.printer.ConverterToWordImpl;
import hw10.project.printer.CurrencyNameConverter;
import hw10.project.printer.Validation;

import java.util.List;

public class CurrencyMain {

	public static void main(final String[] args) {
		new Application(
			new ConverterToWordImpl(new ConvertNumberToWord(), new CurrencyNameConverter(), new Validation()),
			new CurrencyServiceImpl(List.of(new Rub(), new Dollar(), new Euro())))
			.run();
	}
}
