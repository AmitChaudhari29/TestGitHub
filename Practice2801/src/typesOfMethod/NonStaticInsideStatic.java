package typesOfMethod;

public class NonStaticInsideStatic {
	public void m1() {
		System.out.print("I Am Amit Chaudhari");
	}

	public static void m2() {
		System.out.print(" From Wani");
	}

	public static void main(String[] args) {
		NonStaticInsideStatic obj = new NonStaticInsideStatic();
		obj.m1();
		m2();
	}

}
