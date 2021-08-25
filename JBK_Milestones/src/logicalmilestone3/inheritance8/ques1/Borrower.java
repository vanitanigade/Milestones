package logicalmilestone3.inheritance8.ques1;
//Derive a class Depositor (accno ,balance) from Customer. Again derive a class Borrower (loan-no, loan-amt) from Depositor.

public class Borrower extends Customer {
	
	long loan_no;
	double loan_amt;
	
	public Borrower(String name, long phone, long loan_no, double loan_amt) {
		super(name, phone);
		this.loan_no = loan_no;
		this.loan_amt = loan_amt;
	}

	@Override
	public String toString() {
		return "Borrower [loan_no=" + loan_no + ", loan_amt=" + loan_amt + ", name=" + name + ", phone=" + phone + "]";
	}

	
	
	

}
