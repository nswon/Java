package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (x, y) -> { // �Լ��� �������̽� �������� ����
			if(x > y) return x;
			else return y;
		};
		/*
		 simple code = MyNumber myNumber = (x, y) -> x > y? x : y;
		*/
		
		System.out.println(myNumber.getMax(10, 20));
	}

}
