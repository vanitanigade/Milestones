package logicalmilestone3.inheritance8.ques1;
//1. In a bank, different customers having saving account. Some customers may have taken a loan from the bank. 
//So bank always maintains information about bank depositors and borrowers. Design a Base class Customer (name, phone-number).
//Derive a class Depositor (accno ,balance) from Customer. Again derive a class Borrower (loan-no, loan-amt) from Depositor. 
// Write necessary member functions to read and display the details of ‘n’ customers. 

public class Customer {
	
	String name;
	long phone;
	
	public Customer(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + "]";
	}
	
	
	

}
