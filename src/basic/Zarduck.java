package basic;

import java.util.Scanner;

public class Zarduck {

	public static void main(String[] args) {
		      
		//PLAESE PROVIDE SUCH A SYSTEM:
		
		        // menu
				// 1. Login
				// 2. Create Account

				// you select an option
				// 1. Login

				// User Name:
				// Password:
				// give a message

				// you select an option
				// 2. Create Account
				// UserName:
				// First Name:
				// Last Name:
				// Email:
				// Password:
				// Confirm Password:
		
		Scanner lc = new Scanner(System.in);
		String username = "";
		String fname = "";
		String lname = "";
		String email = "";
		String password = "";
		
		
		String entuser = "ahmadi";
		String entpass = "ahmad432@";
		System.out.println("1.Login");
		System.out.println("2. create account");
		
		int cl = lc.nextInt();
		if(cl == 1) {
			System.out.println("Username");
			username = lc.next();
		}if (entuser.equals(username)) {
			System.out.println("volid Username");
		}else {
			System.out.println(" involid Username");
		}
		System.out.println("password");
		password = lc.next();
		if (password.equals(entpass)) {
			System.out.println("volid password");
		}else {
			System.out.println("invalid password");
		} 
		if (cl == 2) {
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
