package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		//a) 
//		System.out.println("(a) Matrix +1:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] += 1;
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

//        // (b) 
//        int summe = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                summe += matrix[i][j];
//            }
//        }
//        System.out.println("\n(b) Summe aller Elemente: " + summe);

		// (c) 
		System.out.println("\n(c) Gedrehte Matrix (90° im Uhrzeigersinn):");

		int[][] rotated = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				rotated[j][2 - i] = matrix[i][j];
			}
		}

		// Ausgabe der gedrehten Matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
	}

}
