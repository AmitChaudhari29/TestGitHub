
package patterns;

public class Starpatterns {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {						 // row
			for (int j = 1; j <= i; j++) { 					// column
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}