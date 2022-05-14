package polymorphism;

public class child extends parent {
	public void m1() {
		System.out.println("child have :bike");
	}
	public void m2() {
		System.out.println("dd");
	}
public static void main(String[] args) {
	parent x = new child();
	x.m1();
	x.m2();
}
}
