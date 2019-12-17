import java.util.Scanner;

public class HowOldAreYou
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
    
		int age;
		String name;

		

		System.out.print( "Whats your name? " );
		name = keyboard.next();

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
        if (age < 16){
           System.out.println("You can't drive. " + name);
        }
        if( age < 18 ){
            System.out.println("You cant vote. " + name);
        }
        if(age < 25){
            System.out.println("You cant rent a car. " + name);
        }
        if (age < 100){
            System.out.println("You can do anything thats legal. " + name);
        }
        if (age >= 100){
            System.out.println("Honestly, I gotta say, You came, You saw, time to break da law! " + name + "!");
        }


		
	}
}