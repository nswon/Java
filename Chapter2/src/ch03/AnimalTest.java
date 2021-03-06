package ch03;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날라다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양 날개를 펴고 날라다닙니다.");
	}
}

class Cat extends Animal {
	public void move() {
		System.out.println("고양이가 점프합니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		Animal cAnimal = new Cat();
		
		//AnimalTest test = new AnimalTest();
		//start
		
		//test.moveAnimal(hAnimal);
		//test.moveAnimal(tAnimal);
		//test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		animalList.add(cAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
