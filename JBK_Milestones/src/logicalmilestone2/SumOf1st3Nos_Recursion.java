package logicalmilestone2;

public class SumOf1st3Nos_Recursion {

	public static void main(String[] args) {
		
		add(1, 0);		//function call
	}

	private static void add(int num, int sum) {		//num=1, sum=0	//num=2, sum=1	//num=3, sum=2
	
		sum = sum + num;							//sum=0+1=1		//sum=1+2=3		//sum=3+3=6
		num++;										//num=num+1=1+1=2	//3		//4
					
		if(num<=3)									//num=2 -> true .......//num=6 -> false
			add(num, sum);						//add(2, 1) 	//add(3, 3) -> recursion -> function calling itself
		else
			System.out.println(sum);			//sum=6
		
		
	}
}
