public class Mage extends Adventurer{
  private int mana;
  private int maxMana;

  public Mage(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
    this.maxMana = mana;
  }

  public Mage(String name){
    super(name, 10);
    this.mana = 20;
    this.maxMana = mana;
  }

  public Mage(){
    this("Bobby");
  }

  public int restoreSpecial(int n){
    if( n > getSpecialMax() - getSpecial()){
              n = getSpecialMax() - getSpecial();
      }
    setSpecial(getSpecial()+n);
    return n;
  }

  public String getSpecialName(){
    return "Mana";
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
		if (getSpecial() >= 5){
	    other.applyDamage(5);
			setSpecial(getSpecial() - 5);
			return (getName() + " attacked " + other + "! " + other + " takes 5 damage!");
		}
    else{
    	return (getName() + " doesn't have enough mana to attack!");
    }
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
		if (other.getSpecial() < other.getSpecialMax()){
			other.setSpecial(20);
			return (getName() + " uses support on " + other + "! " + other + "'s mana fully recovered!");
		}
		else{
			return (getName() + " uses support on " + other + "! " + other + "'s mana is already at max!");
		}
  }

  //heall or buff self
  public String support(){
		if (mana < maxMana){
			restoreSpecial(getSpecialMax() - getSpecial());
			return (getName() + " uses support on himself! " + getName() + "'s mana is fully recovered!");
		}
		else{
			return (getName() + " uses support on himself! " + getName() + "'s mana is already full!");
		}
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
		if (getSpecial() >= 7){
	    other.applyDamage(7);
			setSpecial(getSpecial() - 7);
			return (getName() + " uses special attack! " + other + " takes 7 damage!");
		}
    else{
    	return (getName() + " doesn't have enough mana to use their special attack!");
    }

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
			if (health <= getmaxHP()){
				super.setHP(health);
			}
	  }

	  public void setName(String s){
			super.setName(s);
	  }


}
