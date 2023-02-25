package basic;

public class Kachalo {

	public static void main(String[] args) {
		
		//make a school grading system.
		//res2 += grade > 100 ? "+" : (grade % 10 >= 5 ? "+" : "-");

	
		// 95 - 100 A+
		// 90 - 94 A-
		// 85 - 89 B+
		// 80 - 84 B-
		// 75 - 79 C+
		// 70 - 74 C-
		// 65 - 69 D+
		// 60 - 64 D-
		// 00 - 59 F

		
		double grade = 94;
		String abc = "";
		
		if(grade >= 90) {
		abc = grade >=95 ? "A+" : "A-";
		}
		else if (grade >=80) {
			abc = grade >= 85 ? "B+" : "B-";
		}
		else if(grade >= 70) {
			abc = grade >= 75? "C+" : "C-";
		}
		else if (grade >=60) {
			abc = grade >=65 ? "D+" : "D-";
		}else if (grade > 54) {
			abc = "E";
		} else 
			abc = "F";
		System.out.println(abc);
	
		

	}

}
