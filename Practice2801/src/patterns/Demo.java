package patterns;

public class Demo {
	public static void main(String[] args) {
		int n=6;
			for (int i = 1; i <= n; i++) {						 // row
				for (int j = 2*(n-1); j >= 0; j--) { 					// column
					System.out.print("* ");
				}
				System.out.println("");
			}
	}
}


