package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(20020, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		

		Customer vc = new VIPCustomer(30030, "ȫ�浿"); //����ȯ
		
		//vc. �ڿ� ������ �������� ����ȯ�� �Ǿ��� ������ Customer�� ��������� �޼��常 �� �� �ִ�. VIPCustomer ������ salesPoint �� ����� �� ����.
		
		
	}

}
