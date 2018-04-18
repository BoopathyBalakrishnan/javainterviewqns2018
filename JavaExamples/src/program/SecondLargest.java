package program;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85,86 };

		int largestNo = 0;
		int secondLargestNo = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNo) {
				secondLargestNo = largestNo;
				largestNo = arr[i];
			} else if (arr[i] > secondLargestNo) {
				secondLargestNo = arr[i];
			}
		}
		
		System.out.println(secondLargestNo);

	}

}
