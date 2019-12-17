public class Hero {

    // instance variables
    private int level;
    private int hp;
    private String name;
    private boolean isAlive;


    // default constructor
    public Hero() {   
        level = 1;
        hp = 10;
        name = "John Doe";
        isAlive = true;
    }

    // constructor with parameters -- "overloaded" constructor
    public Hero(String heroName, int heroLevel) {
        level = heroLevel;
        hp = level * 10;
        name = heroName;
        isAlive = true;
    }
    public Hero(String heroName){
        level = 1;
        hp = level*10;
        name = heroName;
        isAlive = true;
       

    }
    // void method with no parameters
    public void displayStatus() {
        if(isAlive) {
            System.out.printf("Our hero, " + name + ", is level " + level + " and currently has " + hp + " HP left or is currently at %.0f%% health.", percentHPLeft() );
            System.out.println("");

        } else {
            System.out.println("Our hero, " + name + ", was level " + level + " but has met their demise.");
        }
    }


    // void method with parameter
    public void heal(int amt) {
         if (isAlive){ 
            hp += amt;
            if (hp > getMaxHP()){
                hp = getMaxHP();
            }
        }

    }

    public void heal(double perc) {
        if (isAlive){ 
            hp += getMaxHP() * perc;
            if (hp > getMaxHP()){
                hp = getMaxHP();
            }
        }
    }

    // non-void method with no parameters
    public int getMaxHP() {
        return level * 10;
    }
    public void takeDamage(int amtDamage){
        if (amtDamage >= hp){ 
            isAlive = false;
        } else {
            hp -= amtDamage;
        }
    }
        
    public double percentHPLeft(){
        return  ((double)hp / getMaxHP())*100;

    }


    }
