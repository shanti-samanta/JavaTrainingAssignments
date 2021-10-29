//ASSOCIATION ExAMPLE 2
//TO be committed.....

package associationPart2;
import java.util.*;

public class DriverClass {

	public static void main(String[] args) 
	{
		UndergradStudent s1= new UndergradStudent();
		UndergradStudent s2= new UndergradStudent();
		
		s1.setName("Shanti Samanta");
		s1.setYear(2017);
		
		s2.setName("Monica Geller");
		s2.setYear(2019);
		
		System.out.println("STUDENT 1 DETAILS");
		System.out.println("-----------------------------------------------------------");
		System.out.print(s1.getName()+" | "+ s1.getYear()+" | ");
		s1.displayBranch();
		s1.displaySociety();
		
		System.out.println("\nSTUDENT 2 DETAILS");
		System.out.println("----------------------------------------------------------");
		System.out.print(s2.getName()+" | "+ s2.getYear()+" | ");
		s2.displayBranch();
		
	}

}
