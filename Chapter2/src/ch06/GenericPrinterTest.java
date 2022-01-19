package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMeterial(plastic);
		
		System.out.println(plasticPrinter.toString());
	}

}
