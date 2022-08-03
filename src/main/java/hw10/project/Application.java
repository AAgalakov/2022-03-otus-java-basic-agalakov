package hw10.project;

import hw10.project.currency.CurrencyService;
import hw10.project.printer.ConverterToWord;

import java.util.Scanner;

public class Application {

	private final ConverterToWord printerService;
	private final CurrencyService currencyService;

	public Application(final ConverterToWord printerService, final CurrencyService currencyService) {

		this.printerService = printerService;
		this.currencyService = currencyService;
	}

	public void run() {

		try (final Scanner in = new Scanner(System.in)) {
			System.out.println("Введите название валюты из возможных");
			final String currency = in.nextLine();
			System.out.println("Введите сумму");
			final int amount = in.nextInt();
			final String result = printerService.convertToString(currencyService.getCurrency(currency), amount);
			System.out.println(result);
		}
	}
}
