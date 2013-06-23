import java.util.*;

public class TestGenerics1 {
	public static void main(String[] args) {
		new TestGenerics1().go();
	}
	
	public void go() {
		//Animal[] animals = {new Dog(), new Cat(), new Dog()};
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		//Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog()); 
		takeAnimals(animals);
		takeAnimals(dogs);
	}
	
	public void takeAnimals(ArrayList<? extends Animal> animals) {
		for (Animal a: animals) {
			a.eat();
		}
	}
}

abstract class Animal {
	void eat() {
		System.out.println("animal eating.");
	}
}

class Dog extends Animal {
	void bark() {}
}

class Cat extends Animal {
	void meow() {}
}
