public class Driver{

  public static void main(String[] args){
    Animal cat = new Animal("meow", 3, "Kitty");
    cat.speak();

    Animal bird = new Bird("squawk", 5, "Bird", 3.0, "blue");
    bird.speak();
  }

}
