package promTickets;
 import java.util.Scanner;
public class PromTickets {
	
		private String grade ;
		private String name ;
		public int party1;

		public PromTickets( String n1, String g1, int p1) {
		grade= g1;
		name = n1;
		party1 = p1;
				
		}

		public int party (int p1) {
			int ticketCost = 0;
			
			if (grade.equalsIgnoreCase("Senior")) {
				if ( party1 == 1) {
					ticketCost = 40;
					}
				if(party1 == 2) {
					ticketCost = 60;
				}
				if (party1 >= 3) {
					ticketCost = 100;
				}
				
			}
			if (grade.equalsIgnoreCase("Junior")) {
				if (party1 == 1) {
					ticketCost = 45;
				}
				if (party1 ==2) {
					ticketCost = 68;
				}
				if (party1 >=3) {
					ticketCost = 113;
				}
				
			}
			if (grade.equalsIgnoreCase("Sophmore"))
				if (party1== 1) {
				ticketCost = 55;
			}
				if (party1 == 2) {
				ticketCost = 83;
			}
				if (party1 >= 3) {
				ticketCost = 138;
			} 
		
			if (grade.equalsIgnoreCase("Freshman"))
				if (party1 == 1) {
					ticketCost = 65;
				}
				if (party1 == 2) {
					ticketCost = 98;
				}
				if (party1 >= 3) {
					ticketCost = 163;
			
				}
				return ticketCost;
			}
	
		
		
	}

	
