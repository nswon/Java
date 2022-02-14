package ch01;

/*abstract : 구현하지 않은 method를 포함하고 있기 때문
implements : interface method를 구현하는 클래스 옆에다 붙임*/

public abstract class Calculator implements Calc{ 

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	
}
