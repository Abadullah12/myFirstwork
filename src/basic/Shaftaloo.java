package basic;

import java.util.Random;

public class Shaftaloo {

	public static void main(String[] args) {
	
		Random rna = new Random();
		
		int y = rna.nextInt(10) + 10;
		System.out.println(y);
		
		int x = rna.nextInt(100) * 2;
		System.out.println(x);

	}

}
