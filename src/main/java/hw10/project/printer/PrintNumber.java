package hw10.project.printer;

import java.util.Map;

public class PrintNumber {

	private final Map<Integer, String> unitsMap = Map.of(
		1, "один",
		2, "два",
		3, "три",
		4, "четыре",
		5, "пять",
		6, "шесть",
		7, "семь",
		8, "восемь",
		9, "девять"
	);

	private final Map<Integer, String> tenMap = Map.of(
		10, "десять",
		11, "одиннадцать",
		12, "двенадцать",
		13, "тринадцать",
		14, "четырнадцать",
		15, "пятнадцать",
		16, "шестнадцать",
		17, "семнадцать",
		18, "восемнадцать",
		19, "девятнадцать"
	);

	private final Map<Integer, String> dozensMap = Map.of(
		2, "двадцать",
		3, "тридцать",
		4, "сорок",
		5, "пятьдесят",
		6, "шестьдесят",
		7, "семьдесят",
		8, "восемьдесят",
		9, "девяносто"
	);

	private final Map<Integer, String> hundredsMap = Map.of(
		1, "сто",
		2, "двести",
		3, "триста",
		4, "четыреста",
		5, "пятьсот",
		6, "шестьсот",
		7, "семьсот",
		8, "восемьсот",
		9, "девятьсот"
	);

	public String numberToString(final int price) {

		if (price == 0) {
			return "ноль";
		}
		final StringBuilder stringBuilder = new StringBuilder();

		final int hundreds = price / 100;
		if (hundreds > 0) {
			stringBuilder.append(hundredsMap.get(hundreds)).append(" ");
		}
		final int dozens = price / 10 % 10;
		if (dozens > 1) {
			stringBuilder.append(dozensMap.get(dozens)).append(" ");
		}
		if (dozens == 1) {
			stringBuilder.append(tenMap.get(price % 100));
		} else {
			stringBuilder.append(unitsMap.get(price % 10));
		}
		return stringBuilder.toString();
	}
}
