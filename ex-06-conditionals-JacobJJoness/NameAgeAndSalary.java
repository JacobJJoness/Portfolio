import java.util.Scanner;

public class NameAgeAndSalary
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
    
		int age;
		String name;
        int salary;
		

		System.out.print( "Whats your name? " );
		name = keyboard.next();

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
        System.out.print( "How much do you make per hour? " );
		salary = keyboard.nextInt();

		System.out.println( "So you're " + name  + " and you are " + age + " years old, and you make " + salary + " per hour.");
	}
}