public class WrapperExamples {

    public static void main(String[] args) {
        // Run the examples below by uncommenting the code
        // the example number corresponds to the number
        // in README.md

        // // EXAMPLE 2

        // // This no longer works as of Java 9, but you need to know it!
        // // These are the constructors for an Integer and Double
        // // Integer num1 = new Integer(5);
        // // Integer num2 = new Integer("5");
        // // Double num3 = new Double(3.0);
        // // Double num4 = new Double("3.0");

        // // These methods have replaced the constructors above in Java 9 and above
        // Integer num1 = Integer.valueOf(5);
        // Integer num2 = Integer.valueOf("5");
        // Double num3 = Double.valueOf(3.0);
        // Double num4 = Double.valueOf("3.0");

        // // EXAMPLE 3
        // System.out.print("The largest integer value is ");
        // System.out.println(Integer.MAX_VALUE);

        // System.out.print("The smallest integer value is ");
        // System.out.println(Integer.MIN_VALUE);

        // System.out.print("If we add 1 to the largest value, we get ");
        // System.out.println(Integer.MAX_VALUE + 1);
        // System.out.println("This is called \"integer overflow\" and occurs when");
        // System.out.println("you try to assign a value greater than " + Integer.MAX_VALUE);
        // System.out.println("to an int or Integer.");     
        
        // // EXAMPLE 4

        // // I can't think of a good reason to do this,
        // // but just in case...
        // Integer num5 = Integer.valueOf(5); 
        // int num6 = num5.intValue();  // returns the int version of num5
        // System.out.printf("num5 = %d and num6 = %d\n",num5,num6);

        // Double num7 = Double.valueOf(3.5);
        // double num8 = num7.doubleValue(); // returns the double version of num7
        // System.out.println("num7 = " + num7 + " and num8 = " + num8);

        // // These are both really useful methods
        //int num9 = Integer.parseInt("107");  // converts a String to an int
        //Integer num10 = Integer.valueOf("107"); // converts a String to an Integer
        //System.out.println("num9 = " + num9 + " and num10 = " + num10);

        // // Don't be too mad at me! Recreating things makes you
        // // appreciate them that much more! :)
        //String binNum11 = Integer.toBinaryString(107);  
        //System.out.println("The binary representation of 107 is " + binNum11);


        // // EXAMPLE 5

        // // When we assign a primitive type to a wrapper class, it will automatically
        // // convert the primitive to the wrapper
        // // This is called "autoboxing"
        // int num11 = 10;

        // // exampleMethod1 is defined at the bottom of the class
        // // scroll down to see it
        // exampleMethod1(num11); // passing an int to a method expecting an Integer
        // Integer num12 = num11;
        // System.out.println("num11 = " + num11 + " and num12 = " + num12);
       
        
        // // EXAMPLE 6
        // // When we assign a wrapper class to a primitive, Java will automatically
        // // convert the wrapper to the primitive
        // // This is called "unboxing"
        // Integer num13 = Integer.valueOf(5);
        // int num14 = num13;
        // exampleMethod2(num13);  // passing an Integer to a method expecting an int
        // System.out.println("num13 = " + num13 + " and num14 = " + num14);


        // // Even though examples 5 and 6 only showed Integer/int, the same
        // // rules apply to Double/double

        // // Moral of the story: If a method is expecting a wrapper OR a primitive,
        // // you can pass it either one and it will run just fine because of 
        // // "autoboxing" and "unboxing".


    }
    // Helper methods for an example
    public static void exampleMethod1(Integer a) {
        System.out.println("This method is expecting an Integer!");
        System.out.println("It received the value " + a);
    }

    // Helper method for an example
    public static void exampleMethod2(int a) {
        System.out.println("This method is expecting an int!");
        System.out.println("It received the value " + a);
    }



}