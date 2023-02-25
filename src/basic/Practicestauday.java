package basic;

public class Practicestauday {

	public static void main(String[] args) {
		double num = 0;
		if(num == 0) {
			System.out.println("this number is " + num);
		}else if (num <0) {
			System.out.println("this number is nigative" + num);
		}else if (num>0) {
			System.out.println("this number is positive" + num);
		}else {
			System.out.println("wrong entrie");
		}
		
		int num1 = 4;
		if(num1%2==0) {
			System.out.println("THIS NUMBER IS EVEN  "+num1);
		}else {
			System.out.println("This nuber is odd  "+ num1);
		}
		
		double a =34;
		double b =4;
		
		if(a>b) {
			System.out.println("A is bigger "+a +"than B "+b);
		}else if(a == b){
			System.out.println(" A is equal to B");
		}else {
			System.out.println(b + "is bigger");
			
		}
		
		double c = 19;
		double d = 2;
		double e = 34;
		double f = 3;
		double lagger = 0;
		if (c>d) {
			lagger = c;
		}else if (d>e) {
			lagger = d;
		}else if (e>f) {
			lagger = e;
		} else if(f>lagger) {
			
		}
		System.out.println(lagger);
	}

}
