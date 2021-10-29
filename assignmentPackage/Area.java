package assignmentPackage;
import java.util.*;
public class Area {

	public static double areaOfCircle(int radius)
	{
		return (3.14*(Math.pow(radius, 2)));
	}
	public static void main(String[] args) {
		
		System.out.println("Area of Circle: "+ areaOfCircle(5));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int val= sc.nextInt();
		System.out.println("Enter a string: ");
		String str= sc.next();
		System.out.println(str+" "+val);
	}

}
