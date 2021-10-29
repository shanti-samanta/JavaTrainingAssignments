package assignmentPackage;

public class Check {
	public static void main(String[] args) {
		int number= 50;
		if(number>0)
		{
			if(number>10)
				System.out.println("Number is greater than 10");
			if(number%10==0)
				System.out.println("Number is divisble by 10");
			else
				System.out.println("Default Else entered");
		}
		
		System.out.println("================================");
		
		if(number>0)
			System.out.println("Number is greater than 0");
		else if(number%10==0)
			System.out.println("Number is divisble by 10");
		else if(number%5==0)
			System.out.println("Number is divisible by 5");
	}

}
