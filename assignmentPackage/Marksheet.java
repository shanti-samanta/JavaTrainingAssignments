package assignmentPackage;
import java.util.*;
public class Marksheet {

	/*
	4.Take the input from user using scanner class Enter three 
	subject marks and find percentage how much percentage student has. 
	Display the grade of student as percentage
	Below 0 or above 100: INVALID MARKS
	0 to 40: FAIL
	40 to 50: GRADE D
	50 to 60: GRADE C
	60 to 70: GRADE B
	70 to 80: GRADE B+
	80 to 90: GRADE A
	Above 90: GRADE A
	*/
	public static double calculatePercentage(double m1, double m2, double m3)
	{
		double average= (m1+m2+m3)/300;
		return (average*100);
	}
	
	public static void calculateGrade(double percentage)
	{
		if(percentage>90)
			System.out.println("GRADE: A+");
		if(percentage<=90 && percentage>80)
			System.out.println("GRADE: A");
		if(percentage<=80 && percentage>70)
			System.out.println("GRADE: B+");
		if(percentage<=70 && percentage>60)
			System.out.println("GRADE: B");
		if(percentage<=60 && percentage>50)
			System.out.println("GRADE: C");
		if(percentage<=50 && percentage>40)
			System.out.println("GRADE: D");
		if(percentage<40)
			System.out.println("GRADE: FAIL");
	}
	
	public static void main(String[] args) {
		
		double marks1=0, marks2=0, marks3=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("ENTER SUBJECT 1 MARKS : ");
		marks1= sc.nextInt();
		
		System.out.print("ENTER SUBJECT 2 MARKS : ");
		marks2= sc.nextInt();
		
		System.out.print("ENTER SUBJECT 3 MARKS : ");
		marks3= sc.nextInt();
		
		
		if(marks1<0 || marks2<0|| marks3<0 || marks1>100 || marks2>100 || marks3>100)
			System.out.println("INVALID MARKS !");
		else 
		{
			double percentageMarks= calculatePercentage(marks1, marks2, marks3);
			System.out.println("PERCENTAGE: "+ String.format("%.2f", percentageMarks)+" %");
			calculateGrade(percentageMarks);
		}
		
	}

}
