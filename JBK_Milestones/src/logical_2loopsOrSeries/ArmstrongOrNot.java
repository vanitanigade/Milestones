package logical_2loopsOrSeries;

public class ArmstrongOrNot {

	public static void main(String[] args) {

		int number=153, remainder, sum=0;		//Armstrong numbers = 1 153 370 371 407 
		int m=number;
		
		while(number !=0) {
			remainder = number%10;
			sum = sum+(remainder * remainder *remainder);
			number = number/10;
		}
		
		if(sum==m)
			System.out.println("number is Armstrong");
		else 
			System.out.println("number is not Armstrong");
	}

}
