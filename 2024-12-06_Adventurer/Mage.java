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
		return (other + " took 5 damage!");
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
		if (other.getSpecial() < other.getSpecialMax()){
			other.setSpecial(20);
			return (other + "'s mana fully recovered!");
		}
		else{
			return (other + "'s mana already max!");
		}
  }

  //heall or buff self
  public String support(){
		if (mana < maxMana){
			restoreSpecial(getSpecialMax() - getSpecial());
			return ("Mana fully recovered!");
		}
		else{
			return ("Mana already full!");
		}
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.applyDamage(7);
		return (other + "takes 7 damage!");
  }

  /*
    standard methods
  */
  public void applyDamage(int amount){
    super.applyDamage(amount);
  }
	
	//Get Methods
	  public String getName(){
	    return super.getName();
	  }

	  public int getHP(){
			return super.getHP();
	  }

	  public int getmaxHP(){
			return super.getmaxHP();
	  }
	  public void setmaxHP(int newMax){
			super.setmaxHP(newMax);
	  }

	  //Set Methods
	  public void setHP(int health){
			super.setHP(health);
	  }

	  public void setName(String s){
			super.setName(s);
	  }


}
