package basic;

import java.util.Scanner;

public class Baadrang {

	public static void main(String[] args) {
		
		Scanner cc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String opreator = "";
		int result = 0;
		
		System.out.println("Please put just two number");
		 a = cc.nextInt();
		 b = cc.nextInt();
		
		System.out.println("please select operator(+ / - * %)");
		opreator = cc.next();
		
		if(opreator.equals("+")) {
			result = a + b;
		}else if (opreator.equals("-")) {
			result = a - b;
		}else if (opreator.equals("*")) {
			result = a * b;
		}else if (opreator.equals("/")) {
			result = a / b;
		}else if (opreator.equals("%")) {
			result = a % b;
		}
		System.out.println(a + opreator + b + "=" + result);
		
		
	
	

	}

}
