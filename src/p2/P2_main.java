package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 5, 4, 5 };
		int max = 1;
		int minIndex = 2;

		max = numbers[0];
		minIndex = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				minIndex = i;
			}
		}
//		System.out.println("max =" + max);
//		System.out.println("minIndex =" + minIndex);
	}
}
