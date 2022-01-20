package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt"); //a.txt가 없음
			System.out.println("log.info : read ok");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString()); //어디서 error가 났늕 console에 찍힘
		} finally { //try가 불리면 finally도 항상 호출이 된다. try마지막에 return;을 찍어도 log.info: finally는 출력된다.
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
