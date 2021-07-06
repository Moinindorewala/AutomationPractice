package Package;

public class Student {
	
	int Roll_num;
	int Age;
	
	public void display()
	{
		System.out.println("hellow all");
		
	}
	
	public void display1()
	{
		System.out.println("this is first project");
	}

	public static void main(String[] args) {
		Student stud = new Student();
	
		stud.display();
		stud.display1();
		stud.Roll_num = 12;
		stud.Age = 22;
		System.out.println(stud.Roll_num);
		System.out.println(stud.Age);

	}

}
