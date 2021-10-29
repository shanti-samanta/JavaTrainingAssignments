package assignmentPackage;
import java.util.*;
public class MultiplicationTable {

	//6.Input a number display its table
	
	public static void main(String[] args) {
		
		int number=0;
		Scanner scan= new Scanner(System.in);
		System.out.print("ENTER A NUMBER: ");
		number= scan.nextInt();
		System.out.println("\n======== TABLE OF "+number+" ========");
		for(int i=1; i<=10; i++)
		{
			System.out.println("\t"+number+" x "+i+" = "+(number*i));
		}
	}

}
