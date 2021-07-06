package Package;

public class method {

	public void md() {

		System.out.println("Default method");
	}

	public void m1(int a) {

		this.m4(1, 2, 3, 4);
		System.out.println("1 Parameterized method");

	}
	public void m2(int a, int b) {

		this.m3(1, 2, 3);
		System.out.println("2 Parameterized method");
	}
	public void m3(int a, int b, int c) {

		this.m1(1);
		System.out.println("3 Parameterized method");

	}
	public void m4(int a, int b, int c, int d) {

		this.md();
		System.out.println("4 Parameterized Method");

	}
	public static void main(String[] args) {

		method obj = new method();
		obj.m2(1, 2);

	}

}
