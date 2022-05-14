package practice;

public class Nonstaticmethod {
	public void m2() {
		System.out.println("I am non static method");
	}
	public static void main(String[] args) {
		Nonstaticmethod x= new Nonstaticmethod();
		x.m2();
		staticmethod.m1();
	}

}
