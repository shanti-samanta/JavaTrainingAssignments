package associationPart2;

public class UndergradStudent extends Student
{
	int year;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayBranch()
	{
		Branch b= new Branch();
		b.studiesBranch();
	}
	
	public void displaySociety()
	{
		Society s= new Society();
		s.collegeSociety();
	}
	
}
