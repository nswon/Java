package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter2 printer = new ThreeDPrinter2();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder) printer.getMaterial();
	}

}
