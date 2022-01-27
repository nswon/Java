package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) { //throw ��밡��. �����ٴ� ��(?)

		FileInputStream fis = null;
		
		try {
			//a.txt�� ����
			fis = new FileInputStream("a.txt"); 
			System.out.println("log.info : read ok");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString()); 
			//��� error�� ���d console�� ����
		} finally { //try�� �Ҹ��� finally�� �׻� ȣ���� �ȴ�. try�������� return;�� �� log.info: finally�� ��µȴ�.
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("log.info : finally");
		}
		
		System.out.println("log.info : continue");
	}

}
