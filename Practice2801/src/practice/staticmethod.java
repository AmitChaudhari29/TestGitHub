package practice;

public class staticmethod {
	int a=20;
	public static void m1() {
		System.out.println("My name is Computer");
		Nonstaticmethod w = new Nonstaticmethod();
		w.m2();
		
	}
	public static void main(String[] args) {
		m1();
	}
	
}
