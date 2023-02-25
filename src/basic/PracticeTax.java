package basic;

public class PracticeTax {
	public static void main(String[] args) {
		double apple =12.20;
		double orange=100.21;
		double tax =4.32;
		double subtotal =0;
		double qytapple =100.29;
		double qytorange =29.22;
		subtotal = apple*qytapple;
		subtotal = orange*qytorange;
		double paytax = subtotal*4.34;
	if(subtotal>500) {
		System.out.println("discount for ur perches"+subtotal*0.2);
	}else if (subtotal>500&&subtotal<2000) {
		System.out.println("discount for ur perches"+subtotal*0.5);
	}else if (subtotal>2000) {
		System.out.println("discount for ur perches"+subtotal*0.10);
	}
	
	
		}
}
