package ch02;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoClosebleObj obj = new AutoClosebleObj();
		
		try(obj) {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("exception");
			
		}
		System.out.println("log.info : end");
	}

}
