package ch02;

public class AutoClosebleObj implements AutoCloseable{

	@Override
	public void close() throws Exception {

		System.out.println("closing...");
	}

}
