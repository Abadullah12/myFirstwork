package basic;

public class SalaryPractice {
public static void main(String[] args) {
	
	double hpay =16.53;
	double workh = 96;
	
	double salary = hpay*workh;
	double tax = 0;
	if(salary <1000) {
		tax = salary*0.2;
	}else if(salary >1000 && salary <5000) {
		tax = salary*10/100;
	}else if (salary >=5000) {
		tax = salary*35/100;
	}
	
	System.out.println("Salary befor Tax  "+salary+"   Salary to get home"+(salary-tax));
	

}
}
