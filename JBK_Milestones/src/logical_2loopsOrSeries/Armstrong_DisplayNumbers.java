package logical_2loopsOrSeries;

public class Armstrong_DisplayNumbers {

	public static void main(String[] args) {


		for(int i=1; i<=1000; i++) {

			int num = i,  remainder, sum=0;
			int m=num;
			while(num!=0) {
				remainder = num%10;
				sum = sum + (remainder*remainder*remainder);
				num = num/10;
			}

			if(sum==m) {
				System.out.print(m + " ");
			} 
		}
	}
}


