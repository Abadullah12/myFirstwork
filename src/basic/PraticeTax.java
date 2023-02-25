package basic;

public class PraticeTax {

	public static void main(String[] args) {
		double apple =5;
		double orange=6;
		double tax =4.32;
		double qytapple =505;
		double qytorange =1;
		double taxapple = qytapple*apple*tax/100;
		double taxorange = qytorange*apple*tax/100;
		double discount = 0;
	double subapple = apple*qytapple;
	double suborange = orange*qytorange;
	
	if(subapple>500) {
		discount=subapple*2/100;
	}else if (suborange>500&&suborange<2000) {
		discount =suborange*5/100;
	}else if (suborange>2000) {
		discount = suborange*10/100;
	}
	System.out.println("your tax for apple"+taxapple);
	System.out.println("your tax for orange"+taxorange);
	System.out.println("apple price before dicount "+apple 
			+"apple Qunty  "+qytapple+"apple price affter discount"+(subapple-discount)+"discont"+discount);
	System.out.println("apple price before dicount "+orange+" Qunty  "
			+ ""+qytorange+"apple price affter discount"+discount);

	}

}
