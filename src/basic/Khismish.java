package basic;

import java.util.Scanner;

public class Khismish {

	public static void main(String[] args) {
	
		// write an if statement to print which name is longer in length

		String firstname = "Mohammad ";
		String secondname = "Mohammad Mustafa";
		
		if (firstname.length() > secondname.length()) {
			System.out.println("First Name with"+ " " +  firstname.length() +"  "+ 
					"letters is bigger then second Name " );
		}else
			System.out.println("Second Name with charter" 
		+" "+ secondname.length() + " " +"is bigger then firstname");

		
		System.out.println("==============================================");
		
		// problem 2
				// write a program that takes two input in the console and checks the length of
				// each
				// it will then tell you which one is bigger
		
		Scanner abad = new Scanner(System.in);
		
		String firstinput = abad.nextLine();
		String secondinput = abad.nextLine();
		
		
		if(firstinput.length() > secondinput.length()) {
			System.out.println("First input is bigger");
		}else
			System.out.println("Second input is bigger");
		
		
		System.out.println("==============================================");
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
