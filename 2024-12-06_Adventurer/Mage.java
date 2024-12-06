public class Mage extends Adventurer{
  private int mana;
  private int maxMana;

  public Mage(String name){
    super(name, 10);
    this.mana = 20;
    this.maxMana = mana;
  }

  public Mage(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
    this.maxMana = mana;
  }

  public int restoreSpecial(int n){
    if( n > getSpecialMax() - getSpecial()){
              n = getSpecialMax() - getSpecial();
      }
    setSpecial(getSpecial()+n);
    return n;
  }

  public String getSpecialName(){
    return ("Mana");
  }
  //accessors
  public int getSpecial(){
    return mana;
  }
  public void setSpecial(int n){
    mana = n;
  }
  public int getSpecialMax(){
    return maxMana;
  }

  public String attack(Adventurer other){
    other.applyDamage(5);
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setSpecial(20);
  }

  //heall or buff self
  public String support(){
    setSpecial(15);
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.applyDamage(7);
  }

  /*
    standard methods
  */
  public void applyDamage(int amount){
    this.HP -= amount;
  }


}
