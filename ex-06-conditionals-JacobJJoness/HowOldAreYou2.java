import java.util.Scanner;

public class HowOldAreYou2
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
           System.out.println("You can't drive, but lets go party age is just a number!, " + name);
        }
        else if( age < 18 ){
            System.out.println("Thats cool I mean votings overrated, " + name);
        }
        else if( age < 25){
            System.out.println(" Yo we can vote heck yeah man too bad about your car stinks we can't rent one," + name);
        }
        else if ( age < 100){
            System.out.println(" Bro full fledged adults now, " + name);
        }
        else {
            System.out.println(" Honestly, lets go dominate a small country using our wisdom ,and scowling eyes to drive the natives out, " + name + "!");
        }


		
	}
}