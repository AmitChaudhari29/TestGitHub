package typesOfVeriables;

public class NonStaticVariable {
	int a = 50;

	public static void main(String[] args) {
		NonStaticVariable obj1 = new NonStaticVariable();
		obj1.a = 656;
		System.out.println(obj1.a);
	}
}
