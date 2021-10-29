
//Association Example 1 Package
//has to be committed

package associationPart1;

public class Car {
	private String color;
	private int speed;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void display()
	{
		System.out.println("SPEED: "+ speed+" | "+" COLOR: "+ color);
	}
	
	
}
