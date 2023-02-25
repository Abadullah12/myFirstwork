package basic;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		
		Scanner day =  new Scanner(System.in);
		int dd = day.nextInt();
		day.close();
		switch (dd) {
		case 1:
		System.out.println("Satday");
		break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("monday");
			break;
			default:
				System.out.println("HAVE A GOOD DAY !");
			
		}
	}

}
