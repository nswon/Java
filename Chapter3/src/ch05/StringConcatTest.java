package ch05;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//��ü���� ���α׷��ְ� ���ٽĹ����� ����
		//���ٽ��� �� �����ϴ� -> Ŭ���� ����� ������ �����ϱ� ����
		//������ �����ϴ°��� �ƴ϶�, ���ٽ��� �����ϸ� �͸� ���� Ŭ������ ���������.

		String s1 = "Hello";
		String s2 = "World";
		//���ٽ� ������ �����
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		//���ٽ� �����
		StringConcat concat = (s, v) -> {
			System.out.println(s + "," + v);
		};
		
		concat.makeString(s1, s2);
	}

}
