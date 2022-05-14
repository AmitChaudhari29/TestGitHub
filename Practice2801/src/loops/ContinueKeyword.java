package loops;

public class ContinueKeyword {
	public static void main(String[] args) {
		System.out.println("Odd Numbers:");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("Even Numbers:");
		for (int i = 100; i >= 0; i--) {
			if (!(i % 2 == 0))
				continue;
			System.out.print(" " + i);
		}
	}
}
