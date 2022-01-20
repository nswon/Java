package ch06;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		
		//customer method -> List
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		//map() : ���� ���ٴ� ����. getName()�� ȣ���ϰڴ�.
		System.out.println("�� ��� ���");
		customerList.stream().map(c->c.getName()).forEach(s-> {
			System.out.println(s);
		});
		
		//mapToInt().sum() : sum�� ���� mapToInt�� Ȱ��
		System.out.println("----------------------------------------");
		System.out.println("������");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		//filter().map().sorted() : filter�� ����, map�� ȣ��, sorted�� ����
		System.out.println("----------------------------------------");
		System.out.println("20�� �̻� �� �̸� ����");
		customerList.stream().filter(c->c.getAge() >= 20).map(n->n.getName()).sorted().forEach(s-> {
			System.out.println(s);
		});
		
	}

}
