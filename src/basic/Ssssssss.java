package basic;

public class Ssssssss {

	public static void main(String[] args) {
		
		String line = "00111102022500";
		//String code 001
		//String data
		//String amount 500
		String code = line.substring(0, 3);
		System.out.println("Code =" + " " + code);
		
		String data = line.substring(2, 10);
		System.out.println("Data =" + " " + data);
		
		//String amount = line.substring(, 0)
		
		int age = 18;
		if(age >= 18) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		String firstname = "Jack";
		String lastname = "Diveson";
		
		System.out.println(firstname.length());	
		System.out.println(lastname.length());

	}

}
