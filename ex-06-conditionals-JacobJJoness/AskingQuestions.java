import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
    
		int age;
		String heightFeet;
        String heightInch;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you.. feet first? " );
		heightFeet = keyboard.next();
        System.out.print( "How many tall er you... inches? " );
		heightInch = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " years old, " + heightFeet + "'" + heightInch + "''" + " tall and " + weight + " heavy.");
	}
}