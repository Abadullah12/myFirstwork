package basic;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
	
		int b1 = 562645;
		int b2 = 4643651;
		int b3 = 674;
		int b4 = 65654;
		int b5 = 321563123;
		
		int largest = 0;
		
		if (b1 > b2) {
			largest = b1;}
		else if(b2 > b3)
			largest = b2;
		else if(b3 > b4)
			largest = b3;
		else if(b4 > b5)
			largest = b4;
		else if(b5 > largest)
			b5 = largest;
		
		System.out.println(largest);
		
		String firstname = "jackack";
		String lastname = "dackdack";
		
		System.out.println(firstname.length());
		System.out.println(lastname.length());
		
		if(firstname.length() > lastname.length()) {
		System.out.println
		("THE FIRST NAME WITH" + firstname.length() + "HAS THE BIG NUMBER OF AMONUT"); }
		else {
			System.out.println("last name has the large number" + lastname.length());}
		
		System.out.println("------------------------------------------------------");
		
		Scanner sc = new Scanner (System.in);
		String firstinput = sc.nextLine();
		System.out.println(firstinput);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
