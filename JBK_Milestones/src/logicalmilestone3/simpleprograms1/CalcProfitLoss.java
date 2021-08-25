package logicalmilestone3.simpleprograms1;

import java.util.Scanner;

//2. W.A.P to accept selling price and cost price and find the profit or loss.

public class CalcProfitLoss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cost price");
		int costprice = sc.nextInt();
		System.out.println("enter selling price");
		int sellingprice = sc.nextInt();
		
		int profit = sellingprice - costprice;
		int loss = costprice - sellingprice;

		if(sellingprice>costprice)
			System.out.println("Profit= " + profit);
		else
			System.out.println("Loss = " + loss);
		
		
	}

}
