package basic;

public class Inter {

	public static void main(String[] args) {
		double age = 36;
		boolean insurence = false;
		double cost = 10589.25;
		double payoutofpack = 0;
		double finalblance =0;
		
		if (age >= 35 && age <= 50 && insurence == true) {
			payoutofpack = cost * 0.1;}
		else if (age >= 35 && age <= 50 && insurence == false) {
			payoutofpack = cost *0.85;}
		else if (age >= 18 && age <=25 && insurence == true) {
			payoutofpack = cost * 0.35;}
		else if (age >= 18 && age <= 25 && insurence == false) {
			payoutofpack = cost * .95;
		}else {
	
			payoutofpack = cost;
		payoutofpack = finalblance;}

		
		System.out.println("Age :" + age + "Insurence :" + insurence );
		System.out.println("Cost $:" + cost);
		System.out.println("Payoutofpack $:" + payoutofpack);
		System.out.println("Finalblance $:" + finalblance);
		
		System.out.println("------------------------------------------------");

		double age1 = 44;
		boolean W2 = true;
		double cost1 = 6465;
		double payment = 0;
		double finala = 0;
		
		if(age1 >= 34 && age1 <= 65 && W2 == true) {
			payment = cost * 0.1;}
		if(age1 >= 34 && age1 <= 65 && W2 == false) {
			payment = cost * 0.85;}
		if(age1 >= 18 && age1 <= 25 && W2 == true) {
			payment = cost * 0.95;}
		if(age1 >= 18 && age1 <= 25 && W2 == false) {
			payment = cost * 0.35;}
		
		
		
		
		
		
	}

}
