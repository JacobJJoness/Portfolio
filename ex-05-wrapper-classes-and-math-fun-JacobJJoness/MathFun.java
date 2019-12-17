/**
 * The MathFun class will contain static methods that will be used in
 * MathFunGame to complete various tasks
 */

public class MathFun {


    /**
     * The sumDice method should simulate a single roll
     * of two regular 6-sided dice, display each dice value
     * and return their sum.
     */
    public static int sumDice() {
        int diOne = (int)(Math.random()*6 + 1);
        int diTwo = (int)(Math.random()*6 +1);
        System.out.printf("The first dice is a %d the second is %d ",diOne, diTwo); 
        System.out.println();
        return diOne + diTwo;
    }



    /**
     * The diffDice method should simulate a single roll
     * of two regular 6-sided dice, display each dice value
     * and return their difference.  The difference will always
     * be non-negative.
     */
    public static int diffDice() {
        int diOne = (int)(Math.random()*6 + 1);
        int diTwo = (int)(Math.random()*6 +1);
        int diff =  Math.abs(diTwo- diTwo);
        System.out.printf("The first dice is a %d the second is %d and their difference is %d",diOne, diTwo,diff); 
        System.out.println();
        return diff;
    }


    /**
     * The distance method will return the distance between the coordinates
     * (x1, y1) and (x2, y2) on a coordinate plane.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return the distance between (x1, y1) and (x2, y2)
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        double yDiff = Math.pow(y2 - y1,2);
        double xDiff = Math.pow(x2 - x1,2);
        double dist = Math.sqrt(xDiff + yDiff) ;
        System.out.println();
        return dist;
    }


    /**
     * randInt will return a random integer x such that
     * min <= x < max
     * @param min
     * @param max
     * @return a random integer greater than or equal to min and less than max
     */
    public static int randInt(int min, int max) {
        int randNum = (int)(Math.random()*max + 1);
        while (randNum < min){
            randNum = (int)(Math.random()*max + 1);
        }
        return randNum;
    }


    public static void main(String[] args) {
        // you can use this main method to test your static methods above!

        // test sumDice
        int diceTotal = sumDice();
        System.out.println("This should be between 2 and 12: " + diceTotal);

        // test diffDice
        int diceDifference = diffDice();
        System.out.println("This should be between 0 and 5: " + diceDifference);


        // test distance
        double dist = distance(3, 4, 5, 6);
        System.out.println("This should be 2.828427: " + dist);

        dist = distance(-1.5, 3.6, 2.9, 8.0);
        System.out.println("This should be 6.222539: " + dist);


        // test randInt 10 times
        for(int i = 0; i < 10; i++) {
            int lower = (int)(Math.random()*5);
            int upper = (int)(Math.random()*50) + 10;
            int roll = randInt(lower, upper);
            System.out.println("This should be greater than or equal to " + lower + " and less than " + upper + ": " + roll);
        }


    }


}
