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
		nineHundredAndNinetyNine();
	}

	private void hundredTwentyTwo(){

		final String s = printNumber.numberToString(122);
		if ("сто двадцать два".equals(s)){
			System.out.println("Тестирование 122 прошло");
		} else {
			System.err.println("Тестирование 122 не прошло");
		}
	}

	private void eleven(){

		final String s = printNumber.numberToString(11);
		if ("одиннадцать".equals(s)){
			System.out.println("Тестирование 11 прошло");
		} else {
			System.err.println("Тестирование 11 не прошло");
		}
	}

	private void fourtyNine(){

		final String s = printNumber.numberToString(49);
		if ("сорок девять".equals(s)){
			System.out.println("Тестирование 49 прошло");
		} else {
			System.err.println("Тестирование 49 не прошло");
		}
	}

	private void five(){

		final String s = printNumber.numberToString(5);
		if ("пять".equals(s)){
			System.out.println("Тестирование 5 прошло");
		} else {
			System.err.println("Тестирование 5 не прошло");
		}
	}

	private void nineHundredAndNinetyNine(){

		final String s = printNumber.numberToString(999);
		if ("девятьсот девяносто девять".equals(s)){
			System.out.println("Тестирование 999 прошло");
		} else {
			System.err.println("Тестирование 999 не прошло");
		}
	}

	private void oneHundredTen(){

		final String s = printNumber.numberToString(110);
		if ("сто десять".equals(s)){
			System.out.println("Тестирование 110 прошло");
		} else {
			System.err.println("Тестирование 110 не прошло");
		}
	}
}
