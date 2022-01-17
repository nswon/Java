package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(20020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		

		Customer vc = new VIPCustomer(30030, "홍길동"); //형변환
		
		//vc. 뒤에 나오는 변수들은 형변환이 되었기 때문에 Customer의 멤버변수와 메서드만 쓸 수 있다. VIPCustomer 변수인 salesPoint 는 사용할 수 없다.
		
		
	}

}
