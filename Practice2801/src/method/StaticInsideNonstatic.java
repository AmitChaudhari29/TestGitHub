package method;

public class StaticInsideNonstatic {
	public static void method1() {
		System.out.println("Static Method Is Running");
	}

	public void method2() {
		method1();
	}

	public static void main(String[] args) {
		StaticInsideNonstatic obj = new StaticInsideNonstatic();
		obj.method2();
	}
}
