package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		//FileInputStream fis = null;
		//throw : ������ ���� main�̴ϱ�
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			
			System.out.println("log.info : read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
