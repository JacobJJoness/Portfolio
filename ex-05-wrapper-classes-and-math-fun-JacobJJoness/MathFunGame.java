import java.util.Scanner;

public class MathFunGame {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Welcome to Math Fun!");
        boolean keepPlaying = true;

        while (keepPlaying) {

            System.out.println("Make a selection:");
            System.out.println("1. Dice Max");
            System.out.println("2. Dice Min");
            System.out.println("3. How far?");
            System.out.println("4. Roll a die");
            System.out.println("5. Quit");
            System.out.print("> ");

            int resp = kbd.nextInt();
            switch (resp) {
            case 1: {
                int diceSum = MathFun.sumDice();
                System.out.println("Your total was " + diceSum);
                if (diceSum >= 10) {
                    System.out.println("That was pretty high!");
                } else if (diceSum >= 6) {
                    System.out.println("That wasn't too bad, I guess.");
                } else {
                    System.out.println("Wow, you're super unlucky!");
                }
                break;
            }
            case 2: {
                int diceDiff = MathFun.diffDice();
                System.out.println("Your difference was " + diceDiff);
                if (diceDiff <= 1) {
                    System.out.println("Wow, that's super low!");
                } else if (diceDiff <= 3) {
                    System.out.println("I mean, I guess that's not too high.");
                } else {
                    System.out.println("Wow, you're super unlucky!");
                }
                break;
            }
            case 3: {
                System.out.print("x1 = ");
                double x1 = kbd.nextDouble();
                System.out.print("y1 = ");
                double y1 = kbd.nextDouble();
                System.out.print("x2 = ");
                double x2 = kbd.nextDouble();
                System.out.print("y2 = ");
                double y2 = kbd.nextDouble();

                double dist = MathFun.distance(x1, y1, x2, y2);
                System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is %.2f.\n", x1, y1, x2, y2,
                        dist);
                break;
            }
            case 4: {
                System.out.print("How many sides? ");
                int numSides = kbd.nextInt();
                int roll = MathFun.randInt(1, numSides + 1);
                System.out.println("You rolled a " + roll + "!");
                break;

            }
            case 5: {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
                break;
            }

            }
            System.out.println(); // insert a space between plays

        }
        kbd.close();
    }
}