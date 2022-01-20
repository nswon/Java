package ch02;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoClosebleObj obj = new AutoClosebleObj();
		
		try(obj) {
			throw new Exception(); //exception 강제로 생성을 통해 exception이 출력됨
		}catch(Exception e) {
			System.out.println("exception");
			
		}
		System.out.println("log.info : end");
	}

}
