package hw04;

import java.util.Arrays;

public class MySort {

	public static void main(final String[] args) {

		final Integer[] choiceSortArray = {1, 0, 6, 11, 3, 7, 4, -1, 3};
		printArray(choiceSortArray);
		final long before = System.nanoTime();
		choiceSort(choiceSortArray);
		final long after = System.nanoTime();
		printArray(choiceSortArray, before, after);
		final Integer[] bubbleSortArray = {1, 0, 6, 11, 3, 7, 4, -1, 3};
		printArray(bubbleSortArray);
		final long beforeChoice = System.nanoTime();
		bubbleSort(bubbleSortArray);
		final long afterChoice = System.nanoTime();
		printArray(bubbleSortArray, beforeChoice, afterChoice);
	}

	private static void bubbleSort(final Integer[] array) {

		for (int j = 0; j < array.length; j++) {
			for (int i = array.length - 1; i > j; i--) {
				if (array[i] < array[i - 1]) {
					final int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
				}
			}
		}
	}

	private static void choiceSort(final Integer[] array) {

		for (int j = 0; j < array.length; j++) {
			int minValue = array[j];
			int indexOfMinValue = j;
			for (int i = j; i < array.length - 1; i++) {
				final int nextIndex = i + 1;
				if (array[nextIndex] < minValue) {
					minValue = array[nextIndex];
					indexOfMinValue = nextIndex;
				}
			}
			if (minValue != array[j]) {
				final int temp = array[j];
				array[j] = minValue;
				array[indexOfMinValue] = temp;
			}
		}
	}

	private static void printArray(final Integer[] array) {

		System.out.println(Arrays.toString(array));
	}

	private static void printArray(final Integer[] array, final long before, final long after) {

		System.out.println(Arrays.toString(array));
		System.out.println(after - before);
	}
}
