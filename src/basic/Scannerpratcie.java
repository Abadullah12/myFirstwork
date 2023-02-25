package basic;
import java.util.Scanner;
public class Scannerpratcie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Username = ("Abadullah");
		String Password = ("I LOVE YOU ");
		
		
		System.out.println("Please enter your Name");
		String input = sc.next();
		
		if(Username.equals(input)) {
	System.out.println("correct user name");
		} else {
		System.out.println("incorrect username");}
	
	
		String firstName = "John";
		String newFistName = firstName.replace("o", "a");
		System.out.println(newFistName);
	}

}
