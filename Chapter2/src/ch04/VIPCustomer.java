package ch04;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	/*
	public VIPCustomer() {
		super(0, null); // �̰� �ҷ��ֱ⸸ �ϸ� �� �� �ִ�. �����ȣ��. �Ϲ��� ȣ���� default �����ڰ� ȣ���� ����Ŭ������ ���ٸ� �����Ͽ��� �ڵ����� �־��ִ� ��
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
