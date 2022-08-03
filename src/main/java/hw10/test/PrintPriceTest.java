package hw10.test;

import hw10.project.currency.Rub;
import hw10.project.printer.CurrencyNameConverter;

public class PrintPriceTest {

	private final CurrencyNameConverter currencyNameConverter = new CurrencyNameConverter();
	private final Rub rub = new Rub();

	public void doAllTest() {

		zeroRubles();
		oneRubleTest();
		twoRublesTest();
		fiveRublesTest();
		tenRublesTest();
		elevenRublesTest();
		twentyRublesTest();
		twentyOneRublesTest();
	}

	private void zeroRubles() {

		final int price = 0;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рублей";
		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void oneRubleTest() {

		final int price = 1;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рубль";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void twoRublesTest() {

		final int price = 2;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рубля";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void fiveRublesTest() {

		final int price = 5;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рублей";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void tenRublesTest() {

		final int price = 10;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рублей";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void elevenRublesTest() {

		final int price = 11;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рублей";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void twentyRublesTest() {

		final int price = 20;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рублей";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void twentyOneRublesTest() {

		final int price = 21;
		final String result = currencyNameConverter.convertCurrencyByAmount(rub, price);
		final String test = "рубль";

		if (result.contains(test)) {
			System.out.printf("Тест с %d рублями пройден%n", price);
		} else {
			System.err.printf("Тест с %d рублями не пройден, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}
}
