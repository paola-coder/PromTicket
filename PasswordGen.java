package promTickets;

public class PasswordGen {
		
		public static String generatePassword() {
			String password = "";
			
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghikjlmnopqrstuvwxyz1234567890";
			
			int rand = (int)(Math.random() * characters.length());
			
			password += characters.substring(rand,rand +1);
			
			rand =(int)(Math.random() * characters.length()); 
			
			password+= characters.substring(rand,rand +1);
			rand =(int)(Math.random() * characters.length()); 
			
			password+= characters.substring(rand,rand +1);
			rand =(int)(Math.random() * characters.length()); 
			
			password+= characters.substring(rand,rand +1);
			rand =(int)(Math.random() * characters.length()); 
			
			password+= characters.substring(rand,rand +1);
			rand =(int)(Math.random() * characters.length()); 
			
			password+= characters.substring(rand,rand +1);
			rand =(int)(Math.random() * characters.length()); 
			
			password+= characters.substring(rand,rand +1);
			rand =(int)(Math.random() * characters.length()); 
			
			
			return "This is your confirmation number for this sale " + password;
		}
		
		public static String generate() {
			int count = 0;
			int rand=0;
			String password= "";
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghikjlmnopqrstuvwxyz1234567890";
		
		
		while (count < 8) {
			rand = (int)(Math.random() * characters.length());
			password += characters.substring(rand, rand +1);
		// count =0 loop checks 0>4
			//
		count ++; 
		}
		return "Thank you!";
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(generatePassword());
			System.out.println(generate());
		}

	}

