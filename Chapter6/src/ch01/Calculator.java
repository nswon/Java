package ch01;

/*abstract : �������� ���� method�� �����ϰ� �ֱ� ����
implements : interface method�� �����ϴ� Ŭ���� ������ ����*/

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
