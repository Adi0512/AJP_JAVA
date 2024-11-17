package programs;

//Superclass: Animal
class Animal {
	void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

//Subclass: Dog
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("The dog barks.");
	}
}

//Subclass: Cat
class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("The cat meows.");
	}
}

public class AnimEx {
	public static void main(String[] args) {

		// Create objects
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();

		// Display sounds
		animal.makeSound();
		dog.makeSound();
		cat.makeSound();

	}
}
