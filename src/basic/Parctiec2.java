package basic;

public class Parctiec2 {

	public static void main(String[] args) {
		
		
		double grade = 89;
		if (grade >= 90)
			System.out.println("A");
		else if (grade >= 80)
		System.out.println("B");
		else if (grade >= 70)
			System.out.println("C");
		else if (grade >= 60)
			System.out.println("D");
		else 
			System.out.println("F");
		
		System.out.println("------------------------------");
		
		double amount = 50;
		double shipping = 0;
		
		if (amount < 30)
			shipping = 10;
		else 
			shipping = 0;
		System.out.println("Amount:" + amount + "  " +"Shipping" + shipping);
		
		
		boolean c = false;
		if(amount < 30 && c == false )
			shipping = amount * 0.05 + 5;
		else if (c == true)
			shipping = (amount * 0.07);
		
		System.out.println("Amount: $" + amount + "   " + "Shipping: $" + shipping);
		
		System.out.println("------------------------------");
		
		double age = 25;
		boolean insurence = true;
		double cost = 10589.25;
		double payoutofpack = 0;
		double finalblance =0;
		
		if (age >= 35 && age <= 50 && insurence == true) {
			payoutofpack = cost * 0.1;}
		if (age >= 35 && age <= 50 && insurence == false) {
			payoutofpack = cost *0.85;}
		if (age >= 18 && age <=25 && insurence == true) {
			payoutofpack = cost * 0.35;}
		if (age >= 18 && age <= 25 && insurence == false) {
			payoutofpack = cost * .95;
		}else {
	
			payoutofpack = cost;
		payoutofpack = finalblance;}

		
		System.out.println("Age :" + age + "Insurence :" + insurence );
		System.out.println("Cost $:" + cost);
		System.out.println("Payoutofpack $:" + payoutofpack);
		System.out.println("Finalblance $:" + finalblance);
		
		System.out.println("-------------------------------------------------------");
		
		int a = 2;
		int b = 1;
		
		if (a > b)
			System.out.println("A is bigger");
		else
			System.out.println(" B is bigger");
		
		System.out.println("-------------------------------------------------------");
		
		int q = 0;
		int p = 1;
		 
		if (q < p)
			System.out.println("Q is the largest amount");
		else
			System.out.println("P is the largest amount");
		
		System.out.println("-------------------------------------------------------");

		int a1 =96;
		int a2 = 16;
		int a3 = 410;
		int larg = 100;
		
		if (a1>a2)
			larg = a1;
		else 
			larg = a2;
		if (a3>larg)
			larg = a3;
		System.out.println("THE LAGEST AMOUNT :" + larg);
		
		System.out.println("-------------------------------------------------------");
		
		double c1 = 182;
		double c2 = 156;
		double c3 = 3453;
		double c4 = 15;
		double big = c1;
		
		if (c2>big)
			big = c2;
		
		if (c3 > big)
			c3 = big;
		else 
			big = c3;
		if (c4 > c3)
			c4 = big;
	
		System.out.println("THE LARG NUMBER : " + big);
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
