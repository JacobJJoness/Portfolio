import java.util.Scanner;


public class TwoMoreQuestions
{
	public static void main( String[] args )
	{
        Scanner keyboard = new Scanner(System.in);
    
		
		String questionOne;
        String questionTwo;
        
        System.out.println("Alive, or not alive?");
        questionOne = keyboard.nextLine();
        System.out.println("Is it outdoors, indoors, or both");
        questionTwo = keyboard.nextLine();
        if (questionOne.equals("alive") && questionTwo.equals("outdoors")){
            System.out.println("Bison");
        }
        if (questionOne.equals("alive") && questionTwo.equals("indoors")){
            System.out.println("Houseplant");
        }
        if (questionOne.equals("alive") && questionTwo.equals("both")){
            System.out.println("Dog");
        }
        if (questionOne.equals("not alive") && questionTwo.equals("both")){
            System.out.println("cell phone");
        }
        if (questionOne.equals("not alive") && questionTwo.equals("outdoors")){
            System.out.println("billboard");
        }
        if (questionOne.equals("not alive") && questionTwo.equals("indoors")){
            System.out.println("shower curtain");
        }
    }
}
           