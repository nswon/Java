package ch05;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//객체지향 프로그래밍과 람다식문법의 차이
		//람다식이 더 간단하다 -> 클래스 만드는 과정을 생략하기 때문
		//실제로 생략하는것이 아니라, 람다식을 구현하면 익명 내부 클래스가 만들어진다.

		String s1 = "Hello";
		String s2 = "World";
		//람다식 이전의 사용방식
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		//람다식 사용방식
		StringConcat concat = (s, v) -> {
			System.out.println(s + "," + v);
		};
		
		concat.makeString(s1, s2);
	}

}
