package oops.level2.Interface_Examples2;

public class ProjectRunnner {

	public static void main(String[] args) {
		
		Flyable [] flyingObjects = { new Bird() , new Aeroplane() };
		
		Animal [] animals = { new Dog() , new Cat()};
		
		for(Flyable object : flyingObjects) { // polymorphism
			object.fly();
		}
		
		for(Animal animal : animals) { // polymorphism
			animal.bark();
		}
	
		
		
		
	}
}
