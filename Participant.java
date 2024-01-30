package project;



public class Participant extends Associate{
	
	private int workingHours;
	
	public Participant()
	{}
	
	public Participant(String id, String name, String aName, String addr, String ph, String mail, int wHours)
	{
		super(id, name, aName, addr, ph, mail);
		workingHours = wHours;
	}
	
	public void setHours(int wHours)
	{
		workingHours = wHours;
	}
	
	public int getHours()
	{
		return workingHours;
	}
	
	@Override
	public String toString()
	{
		return super.toString() +"\n Working Hours: " + workingHours;
	}
	
}