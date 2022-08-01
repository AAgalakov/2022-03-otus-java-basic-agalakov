package hw10.test;

import hw10.project.printer.PrinterCurrencyName;
import hw10.project.currency.Rub;

public class PrintPriceTest {

	private final PrinterCurrencyName printerCurrencyName = new PrinterCurrencyName();
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

	private void zeroRubles(){
		final String s = printerCurrencyName.printPrice(rub, 0);

		if (s.contains("рублей")) {
			System.out.println("Тест с 0 рублями пройден");
		} else {
			System.err.println("Тест с 0 рублями не пройден");
		}
	}
	private void oneRubleTest() {

		final String s = printerCurrencyName.printPrice(rub, 1);

		if (s.contains("рубль")) {
			System.out.println("Тест с 1 рублем пройден");
		} else {
			System.err.println("Тест с 1 рублем не пройден");
		}
	}

	private void twoRublesTest() {

		final String s = printerCurrencyName.printPrice(rub, 2);

		if (s.contains("рубля")) {
			System.out.println("Тест с 2 рублями пройден");
		} else {
			System.err.println("Тест с 2 рублями не пройден");
		}
	}

	private void fiveRublesTest() {

		final String s = printerCurrencyName.printPrice(rub, 5);

		if (s.contains("рублей")) {
			System.out.println("Тест с 5 рублями пройден");
		} else {
			System.err.println("Тест с 5 рублями не пройден");
		}
	}

	private void tenRublesTest() {

		final String s = printerCurrencyName.printPrice(rub, 10);

		if (s.contains("рублей")) {
			System.out.println("Тест с 10 рублями пройден");
		} else {
			System.err.println("Тест с 10 рублями не пройден");
		}
	}

	private void elevenRublesTest() {

		final String s = printerCurrencyName.printPrice(rub, 11);

		if (s.contains("рублей")) {
			System.out.println("Тест с 11 рублями пройден");
		} else {
			System.err.println("Тест с 11 рублями не пройден");
		}
	}

	private void twentyRublesTest() {

		final String s = printerCurrencyName.printPrice(rub, 20);

		if (s.contains("рублей")) {
			System.out.println("Тест с 20 рублями пройден");
		} else {
			System.err.println("Тест с 20 рублями не пройден");
		}
	}

	private void twentyOneRublesTest() {

		final String s = printerCurrencyName.printPrice(rub, 21);

		if (s.contains("рубль")) {
			System.out.println("Тест с 21 рублём пройден");
		} else {
			System.err.println("Тест с 21 рублём не пройден");
		}
	}
}
