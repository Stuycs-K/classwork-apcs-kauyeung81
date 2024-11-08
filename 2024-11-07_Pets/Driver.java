// When getName(); was overwritten, the speak method in the Bird class now calls the new getName();
// Instead of returning NAME, it returns The Mighty NAME

//Bird b2 = new Animal(...); didn't work. This is because Bird is a subclass of Animal
//Animal doesn't have Bird class methods
//This is what we learned in class with the is-a relationship, X can do everything Y can do, but not the other way around

public class Driver{
	public static void main(String[] args){
		Animal cat = new Animal("meow", 3, "Kitty");
		cat.speak();
		
		System.out.println("\n");
		
		Animal bird = new Bird("squawk", 5, "Bird", 3.0, "blue");
		bird.speak();
	
		Animal a1 = new Animal("bark", 4, "Dog");
		Bird b1 = new Bird("squaaaawk", 7, "Birdie", 4.0, "green");
		//Bird b2 = new Animal("caw caw", 12, "Crow");
		Animal a2 = new Bird("hoot", 10, "Owl", 4.0, "brown");
		
		System.out.println("\n");
		a1.speak();
		System.out.println("\n");
		b1.speak();
		System.out.println("\n");
		a2.speak();
	}
}
