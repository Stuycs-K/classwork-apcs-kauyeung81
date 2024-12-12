import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    Adventurer p1 = new CodeWarrior();
    Adventurer p2 = new Mage();

    System.out.println(p1.getName() + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, "
    + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());

    System.out.println(p2.getName() + ", " + p2.getHP() + "/" + p2.getmaxHP() + " HP, "
    + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());

    System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / quit");
    String action = userInput.nextLine();
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
  }
}
