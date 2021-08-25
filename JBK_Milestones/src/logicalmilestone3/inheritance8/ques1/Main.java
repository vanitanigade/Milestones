package logicalmilestone3.inheritance8.ques1;

public class Main {

	public static void main(String[] args) {

		Depositor d1 = new Depositor("abhi", 1234567890, 2233445566l, 1500000.00);
		Depositor d2 = new Depositor("kriti", 1234567891, 2233445577l, 5500450.00);
		
		System.out.println(d1);
		System.out.println(d2);
		
		Borrower b1 = new Borrower("nishi", 1234567889, 4455332233l, 4512310.00);
		Borrower b2 = new Borrower("krish", 1234567878, 4455332563l, 7812310.00);
		
		System.out.println(b1);
		System.out.println(b2);


	}

}
