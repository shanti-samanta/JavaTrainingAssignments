package assignmentPackage;

public class Calculator {
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static int subtract(int a, int b)
	{
		return a-b;
	}
	
	public static int multiply(int a, int b)
	{
		return a*b;
	}
	
	public static double divide(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) 
	{
		System.out.println("ADDITION: "+ add(40,10));
		System.out.println("SUBTRACTION: "+ subtract(40,10));
		System.out.println("MULTIPLICATION: "+ multiply(40,10));
		System.out.println("DIVISION: "+ divide(40,10));
	}

}
