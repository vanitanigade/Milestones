package logicalmilestone3.classnObject7;
//4. W.A.java program create a class Mobile [model_no, model_name, cost] 
//Accept 5 Mobiles details and display it.(use Constructor and array of Objects).

import java.util.Scanner;

public class Mobile_Main {

	public static void main(String[] args) {

	/*	Scanner sc = new Scanner(System.in);		//first e.g. with scanner

		Mobile mblist[]=new Mobile[5];

		for(int i=0; i<5; i++) {
			System.out.println("enter model_no, model_name, cost..");

			int model_no = sc.nextInt();
			String model_name = sc.next();
			float cost = sc.nextFloat();

			mblist[i] = new Mobile(model_no, model_name, cost);
		}
		System.out.println("mobile data: ");
		for(int i=0; i<5; i++) {
			System.out.println(mblist[i]);
		}
*/													//2nd e.g. without scanner
	/*	int model_no[] = {111,222,333,444,555};
		String model_name[] = {"LG","nokia","apple","samsung","oppo"};
		float cost[] = {11000,12000,53000,14000,15000};
		
		Mobile mb[]=new Mobile[5];
		
		for(int i=0; i<5; i++) {
			mb[i] = new Mobile(model_no[i],model_name[i],cost[i]);
		}
		System.out.println("mobile data: ");
		for(int i=0; i<5; i++) {
			System.out.println(mb[i]);
		}  
		
		Mobile m = mb[0];						//max cost
		for(int i=0; i<5; i++) {
		if(m.cost < mb[i].cost)
			m=mb[i];
		}
		System.out.println("mobile data: " + m);
	
			
		int maxNo = model_no[0];					 //max model_no
		for(int i=0; i<model_no.length; i++) {
			if(maxNo < model_no[i])
				maxNo = model_no[i];
		}
		System.out.println("maximum model_no is: " + maxNo);
	*/
																		//3rd way
		Mobile[] m = new Mobile[5];
		m[0]=new Mobile(192513,"Moto G6",20000);
		System.out.println(m[0]);
		m[1]=new Mobile(1917,"OnePlus 7 Pro",53000);
		System.out.println(m[1]);
		m[2]=new Mobile(02,"Mi 10i 5G",24000);
		System.out.println(m[2]);
		m[3]=new Mobile(625,"Samsung Galaxy F62",25999);
		System.out.println(m[3]);
		m[4]=new Mobile(303, "APPLE iPhone 12 Pro Max",125900);
		System.out.println(m[4]);
	}  

}
