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
		
		//forEach(arg) : arr �ȿ� �ִ� ���� �ϳ��� ������ ����
		//arg : �ؾߵǴ� ���� ���ٽ����� �ڵ��ۼ� 
		// n �� ����Ű�� �� : arr �ȿ� �ִ� ����(1, 2, 3, 4, 5) �ϳ��� �ö����� ����ض�
		Arrays.stream(arr).forEach(n -> {
			System.out.println(n);
		});

		//������ ���� ����� �� �ִ�.
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> {
			System.out.println(n);
		});
		//stream�� �ѹ� ���� �Ҹ� �Ǽ� �� ����.
		
		//is. �ؼ� �ٽ� ������. ���� sum stream�� ���� ������
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		//�̷��� �ٽ� �����ؾ��Ѵ�.
		
	}

}
