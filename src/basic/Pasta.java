package basic;

import java.util.Scanner;

public class Pasta {

	public static void main(String[] args) {
		Scanner entiger = new Scanner(System.in);
		
		int x = entiger.nextInt();
		int y = entiger.nextInt();
		int z = entiger.nextInt();
		int w = entiger.nextInt();
	
		String largest = "";
		
		if (x  > y && x>z && x>w) {
			System.out.println("X is the largest");
			
		}else if( y>x && y>z && y>w) {
			System.out.println("Y is bigger");
		}
	}

}
