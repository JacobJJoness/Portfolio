import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String nameFirst;
        String nameLast;
        int age;
        String married;
        String gender;

        System.out.println("Hello, What is your first name?");
        nameFirst = keyboard.next();
        System.out.println("What is your last name?");
        nameLast = keyboard.next();
        System.out.println(" How old are you " + nameFirst + ".");
        age = keyboard.nextInt();
        System.out.println(" Are you male or female?");
        gender = keyboard.next();
        if (age < 20) {
            System.out.println(" I shall call you " + nameFirst + " " + nameLast + ".");
        } else if (age >= 20 && gender.equals("female")) {
            System.out.println(" Are you married (yes) or (no)?");
            married = keyboard.next();
            if (married.equals("yes") && gender.equals("female")) {
                System.out.println("I shall call you Mrs. " + nameLast + ".");
            } else if (married.equals("no") && gender.equals("female")) {
                System.out.println("I shall call you Ms. " + nameLast + ".");
            }
        } else if (gender.equals("male")) {
            System.out.println("I shall call you Mr. " + nameLast + ".");
        }

    }

}