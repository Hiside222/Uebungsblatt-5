package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 299;
		int digits = 0;
		int[] a = new int[9];
		
		if (n == 0) {
			digits = 1;
		} else {
			int temp = n;
			while (temp > 0) {
				temp = temp / 10;
				digits++;
			}
		}
		int index = 8; 
 		int ntemp = n;
 		
 		if (ntemp == 0) {
 			a[index] = 0;
 		}else {
 			while (ntemp > 0) {
 				a[index] = ntemp % 10; 
 				ntemp = ntemp /10; 
 				index--; 
 			}
 		}
// 		System.out.println("digits = " + digits);
//
//        System.out.print("a = [ ");
//        for (int value : a) {
//            System.out.print(value + " ");
//        }
//        System.out.println("]");
	}

}
