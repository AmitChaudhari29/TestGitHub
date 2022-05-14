package method;

public class NonstaticIntoAnotherStatic {
	public void method1() {
		System.out.println("Non-Static Method Is Running");
	}

	public static void method2() {
		NonstaticIntoAnotherStatic obj = new NonstaticIntoAnotherStatic();
		obj.method1();
	}

	public static void main(String[] args) {
		StaticInsideNonstatic.method1();
		method2();
	}

}
