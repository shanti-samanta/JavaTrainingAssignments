
//Association Example 1 Package
//has to be committed

package associationPart1;

public class Honda extends Car
{
	
	public void hondaEngineStatus()
	{
		Engine e1= new Engine();
		e1.engineStarts();
	}
	
	public void hasMusicPlayer()
	{
		MusicPlayer mp= new MusicPlayer();
		mp.musicPlays();
	}

}
