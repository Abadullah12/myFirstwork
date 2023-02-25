package basic;

import java.util.Scanner;

public class Angoor35 {

	public static void main(String[] args) {

		// problem 3
				// write a program that takes input in the console and print that in proper
				// format
				
		
		
		// thIS   >>>>  This
		// jaCK dAvIdSon   >>>>  Jack Davidson
		
		Scanner nn = new Scanner(System.in);
		System.out.println("Please Write Your Name");
		
		String name = nn.nextLine();
		String last = nn.nextLine();	
		String fw =""+name .charAt(0);
		name = name.toUpperCase();
		
		String rem = name.substring(1);
		rem.toLowerCase();
		System.out.println(fw + rem);
		
		
	

		

		
	    
	    
	    
	    
	    
	    


	    
	    
		
		
				

	}

}
