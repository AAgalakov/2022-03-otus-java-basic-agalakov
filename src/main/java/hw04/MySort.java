package hw04;

import java.util.Arrays;

public class MySort {

	public static void main(final String[] args) {

		final Integer[] choiceSortArray = {1, 0, 6, 11, 3, 7, 4, -1, 3};
		printArray(choiceSortArray);
		choiceSort(choiceSortArray);
		printArray(choiceSortArray);
		final Integer[] bubbleSortArray = {1, 0, 6, 11, 3, 7, 4, -1, 3};
		printArray(bubbleSortArray);
		bubbleSort(bubbleSortArray);
		printArray(bubbleSortArray);
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
}
