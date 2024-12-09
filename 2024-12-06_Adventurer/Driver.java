public class Driver{

  public static void main(String[] args){
    Adventurer p1 = new Mage("Bob");
		Adventurer p2 = new Mage("John", 20, 20);
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
		System.out.println("Bob's HP: " + p1.getHP());
		System.out.println("John's HP: " + p2.getHP());
		System.out.println("Bob's max HP: " + p1.getmaxHP());
		System.out.println("John's max HP: " + p2.getmaxHP());
		p1.setmaxHP(20);
		System.out.println("Bob's max HP after setmaxHP(20): " + p1.getmaxHP());
		
		System.out.println("\n" + p1.getSpecialName());
		System.out.println("Bob's mana: " + p1.getSpecial());
		System.out.println("John's mana: " + p2.getSpecial());
		System.out.println("Bob's max mana: " + p1.getSpecialMax());
		System.out.println("John's max mana: " + p2.getSpecialMax());
		p1.setSpecial(10);
		System.out.println("Bob's mana after setSpecial(10): " + p1.getSpecial());
		
		System.out.println("\n" + p1.attack(p2));
		System.out.println("John's HP: " + p2.getHP());
		System.out.println("Bob's mana: " + p1.getSpecial());
		System.out.println(p1.support());
		System.out.println("Bob's mana: " + p1.getSpecial());
		System.out.println(p1.support());
		System.out.println(p1.specialAttack(p2));
		System.out.println("John's HP: " + p2.getHP());
		p2.setHP(20);
		System.out.println("John's HP after setHP(20): " + p2.getHP());
		System.out.println(p1.support(p2));
		
		p1.setSpecial(0);
		System.out.println("\nBob's mana after setSpecial(0): " + p1.getSpecial());
		System.out.println(p1.attack(p2));
		System.out.println(p1.specialAttack(p2));
		
		p1.setName("Jane");
		System.out.println("\nBob's name is now " + p1.getName());
		
  }


}
