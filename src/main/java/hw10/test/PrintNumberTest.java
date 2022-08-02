package hw10.test;

import hw10.project.printer.PrintNumber;

public class PrintNumberTest {

	private final PrintNumber printNumber = new PrintNumber();

	public void allTetPrintNumbers(){
		five();
		eleven();
		fourtyNine();
		oneHundredTen();
		hundredTwentyTwo();
		fourHundred();
		nineHundredAndNinetyNine();
	}

	private void hundredTwentyTwo(){

		final int price = 122;
		final String result = printNumber.numberToString(price);
		final String test = "сто двадцать два";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void eleven(){

		final int price = 11;
		final String result = printNumber.numberToString(price);
		final String test = "одиннадцать";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void fourtyNine(){

		final int price = 49;
		final String result = printNumber.numberToString(price);
		final String test = "сорок девять";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void five(){

		final int price = 5;
		final String result = printNumber.numberToString(price);
		final String test = "пять";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void nineHundredAndNinetyNine(){

		final int price = 999;
		final String result = printNumber.numberToString(price);
		final String test = "девятьсот девяносто девять";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void oneHundredTen(){

		final int price = 110;
		final String result = printNumber.numberToString(price);
		final String test = "сто десять";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}

	private void fourHundred(){

		final int price = 400;
		final String result = printNumber.numberToString(price);
		final String test = "четыреста";
		if (test.equals(result)){
			System.out.printf("Тестирование %d прошло%n", price);
		} else {
			System.err.printf("Тестирование %d не прошло, ожидалось \"%s\", пришло \"%s\"%n", price, test, result);
		}
	}
}
