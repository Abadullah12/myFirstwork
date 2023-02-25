package basic;

public class Charmaghz {

	public static void main(String[] args) {
		double price =15;
		double shipping = 0;
		
		boolean primemembers = true;
		
		// non-prime members
        // if the price is above 50 shipping is $10
        // if the price is 30-49, shipping is $18
        // if the price is 0-29 shipping is $25
        // prime members
        // if the price is more than 20, shipping is free
        // if the price is from 0 - 20, shipping is 10% of the price
		
		
		
		// non-prime members
		if(price > 50 && primemembers == false) {
			shipping = 10;
		}else if( price >=30 && price <=49 && primemembers == false){
			shipping =18;
			System.out.println(shipping);
		}else if ( price >0 && price <29 && primemembers == false) {
			shipping =25;
		}else if ( price >20 && primemembers == true) { 
			shipping =0;
		}else if ( price >0 && price <= 20 && primemembers == true) {
			shipping = price * 0.1;
		}else 
			shipping = 25;
		
		System.out.println("Price = " + price);
		System.out.println("Shipping = "+ shipping);
		System.out.println("Prime Member = " + primemembers);
	

	}

}
