package basic;

public class pratice1 {

	public static void main(String[] args) {
		
		// write the code to check this number and print A
		// if the number is more than 90 or equla 
		// if the grade is in the following range, print letter
		// 90 - 100 = A
		// 80 - 89  = B
		// 70 - 79  = C
		// 60 - 69  = D
		// F
		

		double grade = 100; // verialbe
		if(grade >= 90)
			System.out.println("A");
		else if (grade >= 80)
			System.out.println("B");
		else if (grade >= 70)
			System.out.println("C");
		else if (grade >= 60)
			System.out.println("D");
		else 
			System.out.println("F");
		
		//if else (grade >= 90 && grade <=100)
		//System.out.println();
System.out.println("------------------------------------");
		double amount = 30;
		if(amount > 30)
			System.out.println("free shiping");
		else if(amount < 30)
			System.out.println("10");
		
		
		
		
		
		
		
	}

}
