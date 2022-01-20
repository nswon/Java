package ch06;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		//customer method -> List
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		//map() : 꺼내 쓴다는 느낌. getName()만 호출하겠다.
		System.out.println("고객 명단 출력");
		customerList.stream().map(c->c.getName()).forEach(s-> {
			System.out.println(s);
		});
		
		//mapToInt().sum() : sum을 위해 mapToInt를 활용
		System.out.println("----------------------------------------");
		System.out.println("여행비용");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		//filter().map().sorted() : filter는 조건, map은 호출, sorted는 정렬
		System.out.println("----------------------------------------");
		System.out.println("20세 이상 고객 이름 정렬");
		customerList.stream().filter(c->c.getAge() >= 20).map(n->n.getName()).sorted().forEach(s-> {
			System.out.println(s);
		});
		
	}

}
