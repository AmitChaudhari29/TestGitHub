package typesOfVeriables;

public class StaticVariable {
	static int a = 20;

	public void m1() {
		System.out.println(a);
	}

	public static void m2() {
		System.out.println(a);

	}

	public static void main(String[] args) {
		System.out.println(a);
		m2();
		StaticVariable bo = new StaticVariable();
		bo.m1();

	}
}
