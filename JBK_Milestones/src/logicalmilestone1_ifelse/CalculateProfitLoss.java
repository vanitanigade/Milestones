package logicalmilestone1_ifelse;

import java.util.Scanner;

public class CalculateProfitLoss {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter selling price");
		int sellingPrice = sc.nextInt();
		System.out.println("enter cost price");
		int costPrice = sc.nextInt();
		int profit = sellingPrice-costPrice;
		int loss = costPrice-sellingPrice;
		
		if(sellingPrice > costPrice)
			System.out.println("profit= "+profit);
		else if (sellingPrice < costPrice)
			System.out.println("loss = "+loss);
		else
			System.out.println("selling price is same as cost price-> no loss, no profit");
		
		
	}

}
