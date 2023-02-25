package basic;

import java.util.Scanner;

public class King {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		String firstinput = sc.nextLine();
		
		System.out.println(firstinput);
		
		String secondinput = sc.nextLine();
		
		System.out.println(secondinput);
		
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Username");
		 username = lc.next();
		 System.out.println("Firstname");
		 fname = lc.next();
		 System.out.println("Lastname");
		 lname = lc.next();
		 System.out.println("Email");
		 email = lc.next();
		 System.out.println("Password");
		 password = lc.next();
		 System.out.println("confirm password");
		 entpass = lc.next();
		 if(entpass.equals(password)) {
			 System.out.println("Account Sucessfully Created !");
		 }else {
			 System.out.println("Password Miss Match");
		 }
	}

		
		
		
	}

}
