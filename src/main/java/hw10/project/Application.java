package hw10.project;

import hw10.project.currency.Currency;
import hw10.project.currency.CurrencyServiceImpl;
import hw10.project.printer.PrintService;
import hw10.project.printer.PrinterServiceImpl;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Application {
		private final PrintService printerService;
		private final CurrencyServiceImpl currencyService;

	public Application() {
		this.printerService = new PrinterServiceImpl();
		this.currencyService = new CurrencyServiceImpl();
	}

	public void run() {
		try (final Scanner in = new Scanner(System.in)) {
			final Map<String, Currency> currencyMap = currencyService.getCurrencyMap();
			final Set<String> currencySet = currencyMap.keySet();
			String currency;
			do {
			System.out.println("Введите название валюты из возможных");
				currencySet.forEach(System.out::println);
				currency = in.nextLine();
			} while (!currencySet.contains(currency));
			System.out.println("Введите сумму");
			final int amount = in.nextInt();
			final String result = printerService.convertToString(currencyMap.get(currency), amount);
			System.out.println(result);
		}
	}
}
