package hierarchialinheritance;

public class DriverClass {

	public static void main(String[] args) 
	{
		Restaurant r= new Restaurant();
		Mexican m= new Mexican();
		Italian i= new Italian();
		Chinese c= new Chinese();
		
		System.out.println("Sweet and Spice");
		System.out.println("-----------------------");
		r.useIngredients();
		r.useVegetables();
		
		System.out.println();
		m.servesNachosAndPotatoes();
		
		System.out.println();
		i.servesPasta();
		
		System.out.println();
		c.servesNoodles();
		
	}

}
