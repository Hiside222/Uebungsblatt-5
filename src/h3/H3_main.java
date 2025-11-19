package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		int input = 123456789;

		int rest = input;

		for (int i = 0; i < einheiten[0].length; i++) {
			int wert = einheiten[0][i];

			if (wert <= rest) {
				einheiten[1][i] = rest / wert;
				rest = rest % wert;
			}
		}
//		System.out.println("Betrag: " + input + " Cent");
//		System.out.println("Zerlegung in möglichst wenige Einheiten:");
//
//		for (int i = 0; i < einheiten[0].length; i++) {
//			if (einheiten[1][i] > 0) {
//				System.out.println(einheiten[1][i] + " × " + einheiten[0][i] + " Cent");
//			}
//		}
	}
}
