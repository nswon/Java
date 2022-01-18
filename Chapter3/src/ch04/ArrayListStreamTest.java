package ch04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	public static void enter() {
		System.out.println();
		System.out.println("--------------------");
	}

	public static void main(String[] args) {

		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Jack");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s -> {
			System.out.println(s);
		});
		
		enter();
		
		Stream<String> sortedStream = sList.stream();
		
		sortedStream.sorted().forEach(s -> {
			System.out.print(s + "\t");
		});
		
		enter();
		
		Stream<String> mapStream = sList.stream();
		
		mapStream.map(s->s.length()).forEach(n -> {
			System.out.println(n);
		});

		enter();
		
		Stream<String> filterStream = sList.stream();
		
		filterStream.filter(s -> s.length() >= 5).forEach(n -> {
			System.out.println(n);
		});
		//map(), filter(), sorted() : 중간연산

		//forEach() : 하나씩 꺼내옴, 최종연산
		//람다식은 익명클래스가 실행된다.
	}

}
