package project;

import java.io.*;
import java.util.Scanner;

public class Associate extends Campaign {
	
	//fields 
	private String associateName;
	private String address;
	private String phone;
	private String email;
	
	//methods 
	public Associate() 
	{}
	
	public Associate(String id, String name, String aName, String addr, String ph, String mail)
	{
		super(id, name);
		associateName = aName;
		address = addr;
		phone = ph;
		email = mail;
	}
	
	public void setPhone(String ph)
	{
		phone = ph;
	}
	
	public void setEmail(String mail)
	{
		email = mail;
	}
	
	public void setAddress(String addr)
	{
		address = addr;
	}
	
	public void setAssociateName(String aName)
	{
		associateName = aName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getAssociateName()
	{
		return associateName;
	}
	
	public void editAssociate(Associate a)
	{ 
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("would you like to change the associate info? (Y/N)   ");
		
		char answer = input.next().charAt(0);
		    if ( answer == 'Y')
		    {
		    	Scanner input2 = new Scanner(System.in);
		    	System.out.print("What would you like to change? (E for Email/N for Name/A for Address/P for Phone Number): ");
		    	char select = input.next().charAt(0);
		    	 
		    	 if ( select == 'A')
		    	 {
		    		 Scanner input3 = new Scanner(System.in);
		    		 System.out.print("Enter the new associate Address: ");
			    	 String newAddress = input3.nextLine();
			    	 address = newAddress;
			    	
			    	 System.out.println("\nThe address has been changed successfully.");
		    	 }
		    	 
		    	 else if ( select == 'E')
		    	 {
		    		 Scanner input4 = new Scanner(System.in);
		    		 System.out.print("Enter the new associate Email: ");
			    	 String newMail = input4.nextLine();
			    
			    	 try {  
			    		 if (newMail.matches("[A-Za-z0-9+_.-]+@(.+)$")) {
			    		 email = newMail;
			    		 System.out.println("\nThe email address has been changed successfully.");
			    		}}
			    	 catch (Exception e) { 
			    		 System.out.println("the input format provided is incorrect");	 
			    	 }
		    	 }
		    	 else if (select == 'N')
		    	 {
		    		 Scanner input5 = new Scanner(System.in);
		    		 System.out.print("Enter the new associate name: ");
			    	 String newName = input5.nextLine();
			    	 associateName = newName;
			    	 
			    	 System.out.println("the associate name has been changed successfully.");
		    	 }
		    	 else if (select == 'P')
		    	 {
		    		 Scanner input6 = new Scanner(System.in);
		    		 System.out.print("Enter the new associate Phone number(format: 000-000-0000) : "); 
			    	 String newPhone = input6.nextLine();
			    	 
			    	 try {
			    		 if(newPhone.matches("^(\\+0?1\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$")){
			    	 }
			    	 }
			    	 catch (Exception e) {
			    		 phone = newPhone;
			    		    System.out.println("\nThe phone number has been changed successfully.");
			    		}
		    	 }
		    	 }
		    	 else 
		    		 System.out.println("the input format provided is incorrect");
		    }	    		 	  
	
	
	@Override
	public String toString()
	{
		return super.toString() +"\n Associate name: " + associateName + "\n Associate address:" +
		address + "\n Phone number: " + phone + "\n Email address: " + email;
	}

}
