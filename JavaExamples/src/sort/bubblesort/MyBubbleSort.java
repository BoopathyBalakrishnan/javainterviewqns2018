package sort.bubblesort;

public class MyBubbleSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];

					input[i] = input[j];
					input[j] = temp;
				}

			}

		}

		for (int i = 0; i < input.length; i++) {
			System.out.print(" " + input[i]);
		}
	}

}
