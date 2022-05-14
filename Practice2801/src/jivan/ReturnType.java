package jivan;

public class ReturnType {
	public boolean m1(int a,int b) {
		int c=a+b;
		if(c==100)
			return true;
		return false;
	}
	public static char m2() {
		return '%';
	}
public static void main(String[] args) {
	ReturnType x= new ReturnType();
	System.out.println(x.m1(50, 60));
	System.out.println(m2());
}
}
