public class MathClassExamples {

    /**
     * This method adds to integers and returns
     * their sum
     * @param int a
     * @param int b
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Since the method "sum" is defined in this class
        // and is declared static, we can call it 
        // inside of main without instantiating 
        // a MathClassExamples object
        System.out.print("The sum of 5 and 6 is ");
        System.out.println(sum(5,6));

        // Math class methods
        int x = -5;
        System.out.println("|x| = " + Math.abs(x));

        double y = -17.653;
        System.out.println("|y| = " + Math.abs(y));

        double val1 = Math.pow(3,4); // notice that 3 and 4 are actually ints
        System.out.println("3 ^ 4 = " + val1);
        // 3 and 4 are automatically turned into doubles!
        // and val1 is a double

        // Here the base and exponent are actually doubles
        double val2 = Math.pow(8.72,3.6);
        System.out.println("8.72 ^ 3.6 = " + val2);


        double val3 = Math.sqrt(18);
        System.out.println("The square root of 18 is " + val3);



        // Math.random can be used to generate random
        // numbers in a range
        // Just remember that Math.random gives you
        // a double >= 0 and < 1

        // So basically anything from 0 to 0.9999999
        int die1 = (int)(Math.random()*6 + 1);
        System.out.println("You rolled a " + die1 + "!");

    }
}