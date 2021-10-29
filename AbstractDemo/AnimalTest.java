package AbstractDemo;

public class AnimalTest {

	public static void main(String[] args) 
	{
		Dog d1= new Dog();
		d1.name="LEO";
		d1.breed="Labrador";
		
		System.out.println("HI I AM "+ d1.name);
		System.out.println("I AM A "+ d1.breed);
		d1.animalColor();
		d1.animalSound();
		d1.animalEating();
	}

}
