package main;

public class Taxes {

	static float salary = 45000;

	public static void main(String[] args) {

		System.out.println(userTax(salary, salaryTax(salary)));
	}

	public static int salaryTax(float salary){

		if (salary > 14999){
			if (salary > 19999){
				if (salary > 29999){
					if (salary > 44999){
						System.out.println("25% Tax");
						return 25;
					}
					System.out.println("20% Tax");
					return 20;
				}
				System.out.println("15% Tax");
				return 15;
			}
			System.out.println("10% Tax");
			return 10;
		}
		System.out.println("0% Tax");
		return 0;
	}

	public static double userTax(float salary, float taxRate){

		float taxRatePercent = taxRate/100;
		
		if (salary > 14999){
			if (salary > 19999){
				if (salary > 29999){
					if (salary > 44999){											
						return salary*taxRatePercent;
					}
					return salary*taxRatePercent;
				}
				return salary*taxRatePercent;
			}
			return salary*taxRatePercent;
		}
		return salary*taxRatePercent;
	}
}