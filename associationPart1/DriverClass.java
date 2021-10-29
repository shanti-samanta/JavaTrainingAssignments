
//Association Example 1 Package
//has to be committed

package associationPart1;

public class DriverClass {

	public static void main(String[] args) 
	{
		Honda h1= new Honda();
		Honda h2= new Honda();
		
		h1.setColor("RED");
		h1.setSpeed(180);
		
		System.out.println("CAR 1 DETAILS: ");
		h1.display();
		h1.hondaEngineStatus();
		h1.hasMusicPlayer();
		
		h2.setColor("BLACK");
		h1.setSpeed(160);
		
		System.out.println("\nCAR 2 DETAILS: ");
		h1.display();
		h1.hondaEngineStatus();
	}

}
