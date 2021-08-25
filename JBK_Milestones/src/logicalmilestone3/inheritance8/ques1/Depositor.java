package logicalmilestone3.inheritance8.ques1;
//Derive a class Depositor (accno ,balance) from Customer. Again derive a class Borrower (loan-no, loan-amt) from Depositor.

public class Depositor extends Customer{
	
	long accno;
	double balance;
	
	public Depositor(String name, long phone, long accno, double balance) {
		super(name, phone);
		this.accno = accno;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Depositor [accno=" + accno + ", balance=" + balance + ", name=" + name + ", phone=" + phone + "]";
	}

	
	
	

}
