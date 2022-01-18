package ch04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("------------------");
		
		//forEach(arg) : arr 안에 있는 값을 하나씩 꺼내는 연산
		//arg : 해야되는 일을 람다식으로 코드작성 
		// n 이 가리키는 것 : arr 안에 있는 값들(1, 2, 3, 4, 5) 하나씩 올때마다 출력해라
		Arrays.stream(arr).forEach(n -> {
			System.out.println(n);
		});

		//변수로 만들어서 사용할 수 있다.
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> {
			System.out.println(n);
		});
		//stream은 한번 쓰면 소모가 되서 못 쓴다.
		
		//is. 해서 다시 못쓴다. 만약 sum stream을 쓰고 싶으면
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		//이렇게 다시 생성해야한다.
		
	}

}
