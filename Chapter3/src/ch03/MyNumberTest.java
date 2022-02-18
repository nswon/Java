package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (x, y) -> { // 함수형 인터페이스 변수에다 대입
			if(x > y) return x;
			else return y;
		};
		/*
		 simple code = MyNumber myNumber = (x, y) -> x > y? x : y;
		*/
		
		System.out.println(myNumber.getMax(10, 20));
	}

}
