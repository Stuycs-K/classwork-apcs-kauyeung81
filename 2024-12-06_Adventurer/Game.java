import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    Adventurer p1 = new CodeWarrior();
    Adventurer p2 = new Mage();
		
		while (p1.getHP() > 0 && p2.getHP() > 0){
	    System.out.println(p1.getName() + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, "
	    + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());

	    System.out.println(p2.getName() + ", " + p2.getHP() + "/" + p2.getmaxHP() + " HP, "
	    + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());

	    System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / quit");
	    String action = userInput.nextLine();
			
			while (!action.equals("quit") && !action.equals("a") && !action.equals("attack")
				&& !action.equals("sp") && !action.equals("special") && !action.equals("su")
			&& !action.equals("support")){
				System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / quit");
				action = userInput.nextLine();
			}
			
	    if (action.equals("quit")){
	      System.exit(0);
	    }
	    if (action.equals("a") || action.equals("attack")){
	      System.out.println("\n" + p1.attack(p2));
	    }
	    if (action.equals("sp") || action.equals("special")){
	      System.out.println("\n" + p1.specialAttack(p2));
	    }
	    if (action.equals("su") || action.equals("support")){
	      System.out.println("\n" + p1.support());
	    }
			if (p2.getHP() > 0){
				int roll = (int)(Math.random()*3 + 1);
				System.out.println(roll);
				if (roll == 1){
					System.out.println("\n" + p2.attack(p1));
				}
				if (roll == 2){
					System.out.println("\n" + p2.specialAttack(p1));
				}
				if (roll == 3){
					System.out.println("\n" + p2.support());
				}
			}
			if (p1.getHP() <= 0){
				System.out.println("\n" + p2.getName() + " has defeated " + p1.getName() + "!");
			}
			if (p2.getHP() <= 0){
				System.out.println("\n" + p1.getName() + " has defeated " + p2.getName() + "!");
			}
			
		}
  }
}
