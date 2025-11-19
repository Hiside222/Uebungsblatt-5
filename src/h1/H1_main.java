package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = { 1, 3, 2, 4 };

		int links = 0;
		int rechts = myArray.length - 1;

		while (links < rechts) {
			int temp = myArray[links];
			myArray[links] = myArray[rechts];
			myArray[rechts] = temp;

			links++;
			rechts--;
		}
//		System.out.println("Umgedreht:");
//		for (int n : myArray) {
//			System.out.print(n + " ");
	}
}
