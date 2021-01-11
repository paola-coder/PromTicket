package promTickets;

import java.util.Scanner;

public class TicketTester {

	public static void main(String[] args) {
		
			PromTickets ticket ;
			
			Scanner keyboard = new Scanner (System.in);
			System.out.println("What year are you in?");
			String grade = keyboard.nextLine();
			
			System.out.println("What is your name?");
			String name = keyboard.nextLine();
			
			System.out.println("How many are in your party?");
			int party = keyboard.nextInt();
			
			ticket = new PromTickets(name,grade, party);
			String ticketType=" " ;
//			
			if ( party == 1) {
				ticketType = "solo";
			}
			else if (party == 2 ) {
				ticketType = "couple";
			}
			else if (party >= 3 ) {
				ticketType = "group";
			}
			
			
			
			String ticketType2 =" " ;
//			
			if ( grade.equalsIgnoreCase("Senior")) {
				ticketType2= "Senior";
			}
			else if ( grade.equalsIgnoreCase("Junior")) {
				ticketType2 = "Junior";
			}
			else if ( grade.equalsIgnoreCase("Sophmore")) {
				ticketType2= "Sophmore";
			}
			else if ( grade.equalsIgnoreCase("Freshman")) {
				ticketType2= "Freshman";
			}
			 
			System.out.println(" " +name+ " purchased "+ ticketType + " ticket(s) as a "+ticketType2 + 
					" with a cost of $ " + ticket.party(party)+". "+ PasswordGen.generatePassword()) ;
}
}


			
//		
//	System.out.println(" " + n1 + "has purchased a " + ticketType2+ "," + ticketType+ " tickets."  
//				
