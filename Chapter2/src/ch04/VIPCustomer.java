package ch04;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	/*
	public VIPCustomer() {
		super(0, null); // 이걸 불러주기만 하면 쓸 수 있다. 명시적호출. 암묵적 호출은 default 생성자가 호출할 상위클래스가 없다면 컴파일에서 자동으로 넣어주는 것
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int, String) call");
	}
	*/
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

	
}
