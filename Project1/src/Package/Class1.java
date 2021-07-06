package Package;

public class Class1 {

	public Class1() {
		
		this(1, 2, 3);// three parameterize constructor
		System.out.println("Default Constructor");

	}
	public Class1(int a) {
		
		this();// Default constructor
		System.out.println("1 Parameterized Constructor");

	}
	public Class1(int a, int b) {

		this(1, 2, 3, 4); // Four parameterized constructor
		System.out.println("2 Parameterized Constructor");

	}
	public Class1(int a, int b, int c) {

		System.out.println("3 Parameterized Constructor");

	}
	public Class1(int a, int b, int c, int d) {
		
		this(1); // one parameterize constructor
		System.out.println("4 Parameterized Constructor");

	}
	public static void main(String[] args) {

		Class1 obj = new Class1(1, 2);// two parameterize constructor

	}
}
