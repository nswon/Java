package ch02;

public class Customer {

	protected int customerID; //고객 아이디
	protected String customerName; //고객 이름
	protected String customerGrade; //고객 등급
	int bonusPoint;
	double bonusRatio;
	
	String agentID;
	double saleRatio;
	
	/*
	public Customer() { //default생성자
		//super(); 코드를 컴파일할 때 자동으로 넣어줌
		//VIPCustomer는 Customer을 부르고, Customer도 상위 클래스를 불러야하는데 없을때 super();키워드를 넣어줌
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		
		System.out.println("Customer() call");
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		System.out.println("Customer() call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."; 
	}
	
}
