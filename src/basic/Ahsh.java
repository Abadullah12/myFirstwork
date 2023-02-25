package basic;

public class Ahsh {

	public static void main(String[] args) {
		
		/* interviwe question */
		
		
		int num = 18;
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Abadullah Ahamdi");
		}else if (num % 3 == 0) {
			System.out.println("Abadullah");
		}else if (num % 5 == 0) {
			System.out.println("Ahmadi");
		}else {
			System.out.println(num);
		}

		System.out.println("---------------------------------------------");
		
		//==========================================================
		int x = 15;
		int y = 2546;
		 
		boolean a = x<y ? true : false;
		System.out.println(a);
		
		//==============================================================
		System.out.println("----------------------------------------------");
		int e = -22;
		int f = +3;
		
		
		boolean u = e > f ? true : false;
		System.out.println(u);
		
	}

}
