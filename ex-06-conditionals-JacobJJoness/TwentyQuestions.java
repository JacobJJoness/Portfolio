import java.util.Scanner;


public class TwentyQuestions
{
	public static void main( String[] args )
	{
        Scanner keyboard = new Scanner(System.in);
    
		
		String questionOne;
        String questionTwo;
        
        System.out.println("Animal, Vegetable, or Mineral?");
        questionOne = keyboard.next();
        if (questionOne.equals("animal")){
            System.out.println("Is it bigger than a breadbox?");
            questionTwo = keyboard.next();
                if (questionTwo.equals("yes")){
                    System.out.println("Moose?");
                }
                else {
                    System.out.println("Squirrel?");
                }
        }
        else if (questionOne.equals("vegetable")){
            System.out.println("Is it bigger than a breadbox?");
            questionTwo = keyboard.next();
                if (questionTwo.equals("yes")){
                    System.out.println(" Watermelon?");
                }
                else {
                    System.out.println("carrot?");
                }
        }
        else {
            System.out.println("Is it bigger than a breadbox?");
            questionTwo = keyboard.next();
                if (questionTwo.equals("yes")){
                    System.out.println(" Paper Clip?");
                }
                else {
                    System.out.println("Camaro?");
                }
        }

		

		


		
	}
}