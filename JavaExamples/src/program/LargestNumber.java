package program;

public class LargestNumber {

	public static void main(String[] args) {
		int[] a = new int[] { 20, 30,500, 50, 4, 71, 100 };
		int maxNo = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxNo) {
				maxNo = a[i];
			}
		}

		System.out.println(maxNo);
	}

}
