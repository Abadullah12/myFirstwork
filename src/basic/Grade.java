package basic;

public class Grade {

	public static void main(String[] args) {
		double grade = 50;
	
		
		if(grade >= 95 && grade <=100)  
		System.out.println("A+");
		
		else if(grade >= 90 && grade <=95)
		System.out.println("A-");
		
		else if(grade >= 85 && grade <=90)
			System.out.println("B+");
	
		else if(grade >= 80 && grade <=85)
			System.out.println("B-");
			
	
		else if(grade >= 75 && grade <=80)
			System.out.println("C+");	
		
		else if(grade >= 70 && grade <=75)
			System.out.println("C-");
		
		else if(grade >= 65 && grade <=70)
			System.out.println("D+");
		
		else if(grade >= 60 && grade <=65)
			System.out.println("D-");
		
		else if(grade >= 55 && grade <=60)
			System.out.println("D-");
		
		
		else  
			System.out.println("F");
		
		System.out.println("==================================================");
		
		double grad = 45;
		String res = "";
		
		if(grad >= 90) {
			res = grad >= 95 ? "+A" : "A-";
			
		}
			
		

		System.out.println("==================================================");
		double a = 40;
		String b = "";
		
		if (a >= 90) {
			b = a >= 95? "A+" : "A-";
			//if (a >= 95) {
			//	b = b + "+";
				//b += "+";
			//}else {
			//	b = b + "-";
			//}
		} if (a >= 80) {
			b = a >= 85? "B+" : "B-";
			//b = "B";
			//if (a >= 85) {
				//b = b + "+";
			//}else {
			//	b = b + "-";
			//}
		}
			if (a >= 70) {
				b = a >= 75? "C+":"C-"; 
				//b = "c";
				//if (a >= 95) {
				//	b = b + "+";
			//	}else {
				//	b = b + "-";
				//}
			} 
		
		System.out.println(b);
		
		

	}

}
