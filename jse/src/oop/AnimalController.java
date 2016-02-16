package oop;

public class AnimalController {
	public static void main(String[] args) {
		AnimalService cat = new CatServiceImple();
		AnimalService dog = new DogServiceImple();
		dog.bark();
	}
}
