package Package;

public class Assignment1 {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of sum is "+c);
		return c;
		
	}
	
	public int sub(int x, int y)
	
	{
		int z;
		z=x-y;
		System.out.println("Result of sub is "+z);
		return z;
		
	}
	public int multi(int a1, int a2)
	
	{
		int a3;
		a3=a1*a2;
		System.out.println("Result of multi is "+a3);
		return a3;
		
	}
    public int devide(int x1, int y1)
	
	{
		int z1;
		z1=x1/y1;
		System.out.println("Result of devide is "+z1);
		return z1;
	}
    
    public static void main(String[] args) {
		
    	Assignment1 total_sum = new Assignment1();
    	
    	int sum=total_sum.sum(10, 2);
    	int sum1=total_sum.sum(sum, 2);
    	int sub=total_sum.sub(sum1, 2);
    	int multi=total_sum.multi(sub, 2);
    	total_sum.devide(multi, 2);
    	
	}
	

}
