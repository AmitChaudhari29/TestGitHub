package typesOfMethod;

public class NonStaticMethod {
	public void m1() {
		System.out.print("I Am Amit Chaudhari");
	}

	public void m2() {
		System.out.print(" From Wani");
	}

	public static void main(String[] args) {
		NonStaticMethod obj = new NonStaticMethod();
		obj.m1();
		NonStaticMethod obj1 = new NonStaticMethod();
		obj1.m2();
	}

}
