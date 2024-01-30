package project;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Campaign campaign = new  Campaign("762391", "first campaign");
        Associate associate =new Organizer("9388844", "Circus funds campaign", "Sandra Clerk", "Maine street", "04023496854", "sand_cl@gmail.com", 8, 7000);  
		Associate associate2 = new Associate("999994", "Univeristy funds campaign", "Joseph Elliot", "Ave street", "0403333210", "Josephelliot@gmail.com"); 
		Participant participant = new Participant("0933329", "name", "Paricipant one", "Five street" , "0330302129", "partici1@gmail.com", 7);
		Mission mission = new Mission("9442111","University fund part One", "scholarships", "in progress");
		Organizer organizer = new  Organizer("9388844", "Gallery fund campaign", "Ivar ragnarsson", "Kattegat street", "0708764321", "ivarsson@gmail.com", 10, 10000);
		Resources resource = new Resources("5555", "venue", "charity donation", "52218", "refunds", "in progress");
		
		System.out.println(associate.toString());
		System.out.println(campaign.toString());
		System.out.println(participant.toString());
		System.out.println(mission.toString());
		System.out.println(organizer.toString());
		System.out.println(resource.toString());
		
		
		campaign.editCampaign(resource);
		associate.editAssociate(associate);
	
 
	}

}

