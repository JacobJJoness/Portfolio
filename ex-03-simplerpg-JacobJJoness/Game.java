public class Game {

    public static void main(String[] args) {
        
        // instantiate the Hero class using "default" constructor
        //Hero firstHero = new Hero(); 
        //firstHero.displayStatus();
        //firstHero.takeDamage(15);
        //firstHero.displayStatus();


        // instantiate the Hero class using constructor with String, int parameters
        //Hero secHero = new Hero("Secundus", 5);
        //secHero.displayStatus();
        //secHero.takeDamage(13);
        //ecHero.displayStatus();
        
        Hero jacob = new Hero("Jacob");
        jacob.displayStatus();
        jacob.takeDamage(5);
        jacob.displayStatus();
        jacob.heal(15);
        jacob.displayStatus();


        Hero hornet = new Hero("Hornet",2);
        hornet.takeDamage(30);
        hornet.heal(20);
        hornet.displayStatus();

    }



}