package project;



import java.util.Scanner;

public class Organizer extends Associate{
	
	private int experienceYears;
	private double salary;
	
	public Organizer()
	{}
	
	public Organizer(String id, String name, String aName, String addr, String ph, String mail, int exYears, double s)
	{
		super(id, name, aName, addr, ph, mail);
		experienceYears = exYears;
		salary = s;
	}
	
	public void setYears(int exYears)
	{
		experienceYears = exYears;
	}
	
	public void setSalary(double s)
	{
		salary = s;
	}
	
	public int getYears()
	{
		return experienceYears;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void displaySalaries()
	{ 
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of experience years: ");

		    int answer = input.nextInt();
		    
		    while ( answer >=0 && answer < 60)
		    {
		    if ( answer <= 0)
		    {
		    	System.out.print("\nThe salary is 0$");
		    }
		    else if (answer > 0 && answer <= 5)
		    	System.out.println("\nThe salary is between 1000$ and 5000$");
		    else if (answer > 5 && answer <= 10)
		    	System.out.println("\nThe salary is between 7000$ and 10000$");
		    else if (answer >= 10)
		    	System.out.println("\nThe salary is 10000$+");  		 	  
	} 
		    	System.out.println("\nThe number of experience years is out of range");
	}
	
	@Override
	public String toString()
	{
		return super.toString() +"\n Experience Years: " + experienceYears + "\n Salary: " + salary;
	}
	
}