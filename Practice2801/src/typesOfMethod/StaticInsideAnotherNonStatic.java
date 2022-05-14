package typesOfMethod;

public class StaticInsideAnotherNonStatic {
	public static void m1() {
		System.out.print("I Am Amit Chaudhari");
	}

	public void m2() {
		System.out.print(" From Wani");
	}

	public static void main(String[] args) {
		m1();
		StaticInsideAnotherNonStatic obj = new StaticInsideAnotherNonStatic();
		obj.m2();
	}

}
