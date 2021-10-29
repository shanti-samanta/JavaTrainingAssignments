package assignmentPackage;
import java.util.*;
public class SumOfNumber {

	
	//7.Find sum of fist n natural number using loop

	public static void main(String[] args) {
		int number=0, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.print("ENTER A NUMBER: ");
		number= scan.nextInt();
		for(int i=1; i<=number; i++)
		{
			sum+=i;
		}
		System.out.println("SUM OF FIRST "+number+" NUMBERS: "+sum);
	}

}
