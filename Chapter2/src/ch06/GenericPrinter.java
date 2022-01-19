package ch06;

public class GenericPrinter<T> {
	
	private T material;

	public T getMeterial() {
		return material;
	}

	public void setMeterial(T meterial) {
		this.material = meterial;
	}
	
	public String toString() {
		return material.toString();
	}

}
