package assignmentPackage;

public class SimpleInterest {

	public static double calculateInterest(int P, int R, int T)
	{
		return ((P*R*T)/100);
	}
	public static void main(String[] args) {
		
		System.out.println("Simple Interest: "+ calculateInterest(9000, 10, 2));
	}

}
