public class StringExamples {
    public static void main(String[] args) {

        // To run each example, highlight the relevant code
        // and uncomment it by pressing ctrl and /

        // // EXAMPLE ONE

        // // Two different, equally valid ways of creating a String
        // String exampleOneA = "This is a String literal";
        // String exampleOneB = new String("This is using the String class constructor");
        // System.out.println(exampleOneA);
        // System.out.println(exampleOneB);

        ///////////////////////////////////////////

        // // EXAMPLE TWO

        // // Strings are "immutable" -- their methods DO NOT CHANGE THEM!
        // String exampleTwo = "Strings are immutable!";

        // exampleTwo.toUpperCase(); // call the toUpperCase method on exampleThree
        // System.out.println(exampleTwo); // still prints the original sentence

        // // To see what the toUpperCase method does, uncomment the next line.
        // // System.out.println(exampleTwo.toUpperCase());

        ///////////////////////////////////////////

        // // EXAMPLE THREE

        // String exampleThreeA = "What would you";
        // String exampleThreeB = " do for a Klondike bar?";
        // System.out.println(exampleThreeA);
        // System.out.println(exampleThreeB);

        // String exampleThreeC = exampleThreeA + exampleThreeB;
        // // exampleThreeC is a WHOLE NEW STRING containing the
        // // values from exampleThreeA and exampleThreeB
        // System.out.println(exampleThreeC);

        // exampleThreeA += exampleThreeB;
        // // exampleThreeA is now a WHOLE NEW STRING containing the
        // // values that used to be in exampleThreeA and exampleThreeB
        // System.out.println(exampleThreeA);

        ///////////////////////////////////////////

        // // EXAMPLE FOUR

        // int i = 3;
        // double d = 2.5;
        // boolean b = true;
        // String exampleFourA = "The integer: " + i;
        // String exampleFourB = "The double: " + d;
        // String exampleFourC = "The boolean: " + b;
        // // the int, boolean, and double are automatically converted into Strings
        // // so they can be concatenated.
        // System.out.println(exampleFourA);
        // System.out.println(exampleFourB);
        // System.out.println(exampleFourC);

        ///////////////////////////////////////////

        // // EXAMPLE FIVE

        // // \" is used to insert a quotation mark
        // String exampleFiveA = "Bill Gates never actually said, \"640K ought to be enough for anybody.\"";

        // // \\ is used for inserting a backslash
        // String exampleFiveB = "4 \\ 2 is 2";

        // // \t is used to insert a tab (usually 4 spaces, but depends on the setup)
        // String exampleFiveC = "\tThis is useful for indenting text\tor for spacing things out!";

        // // \n inserts a linebreak (newline) in the string
        // String exampleFiveD = "Line one\nLine two\nLine three";

        // System.out.println(exampleFiveA);
        // System.out.println(exampleFiveB);
        // System.out.println(exampleFiveC);
        // System.out.println(exampleFiveD);

        ///////////////////////////////////////////

        // // EXAMPLE SEVEN

        // String exampleSeven = "This String has 36 characters in it.";
        // System.out.println(exampleSeven.length());

        // System.out.println(exampleSeven.charAt(0)); // prints 'T'
        // System.out.println(exampleSeven.charAt(35)); // prints '.'
        // //System.out.println(exampleSeven.charAt(-1)); // IndexOutOfBoundsException
        // //System.out.println(exampleSeven.charAt(36)); // IndexOutOfBoundsException

        //////////////////////////////////////////

        // // EXAMPLE EIGHT
        // Integer myInt = 10;
        // String exampleEightA = "myInt is an Integer (a \"wrapper\" class) with a value of " + myInt;
        // String exampleEightB = "myInt is an Integer (a \"wrapper\" class) with a value of " + myInt.toString(); 
        // // invoking
        // // toString
        // // is
        // // unnecessary!
        // System.out.println(exampleEightA);
        // System.out.println(exampleEightB);

        //////////////////////////////////////////

        // // EXAMPLE NINE

        // // You can use the constructor to create a String
        // // or you can use a literal String
        // String exampleNineA = new String("This is a String.");
        // String exampleNineB = "This is also a String.";
        
        // // Call the length() method on the string object using
        // // "dot" notation
        // int lengthOfExampleNineA = exampleNineA.length();
        // System.out.println("exampleNineA is " + lengthOfExampleNineA + " characters long.");
        
        // // Get a substring starting at index 3 and stopping at index 8
        // // This is a String.
        // // 01234567891111111
        // //           0123456
        // String exampleNineC = exampleNineA.substring(3, 9); // "s is a" 
        // System.out.println(exampleNineC);

        // // Get a substring starting at index 9 and going to the end
        // String exampleNineD = exampleNineA.substring(9); // " String." 
        // System.out.println(exampleNineD);

        // // Find the FIRST occurence of the substring "is"
        // int whereisIs = exampleNineA.indexOf("is"); 
        // System.out.println("is is at index " + whereisIs);  // why is it 2?

        // // Remember, everything is "case sensitive" ie. capital and lowercase are DIFFERENT
        // int whereIsIsnt = exampleNineA.indexOf("Is");
        // System.out.println("this should be negative one: " + whereIsIsnt);

        // // >, <, == operators do NOT work correctly with Strings
        // // They compare the REFERENCE address (memory), not the actual
        // // letters in the String
        String exampleNineE = "Never use the == operator with Strings!";
        String exampleNineF = new String("Never use the == operator with Strings!");
        System.out.println(exampleNineE.equals(exampleNineF));
        System.out.println(exampleNineE == exampleNineF);

        // // Change the following strings to see how compareTo works
        // String exampleNineG = "This starts with a T";
        // String exampleNineH = "this starts with a t";
        // System.out.println(exampleNineG.compareTo(exampleNineH));

        //////////////////////////////////////

        // EXAMPLE TEN

        // // This code will print out one letter
        // // at a time from the string
        // String exampleTen = "ABCDEFGHIJKLMNOP";
        // int i = 0;
        // while(i < exampleTen.length()) {
        //     System.out.println(exampleTen.substring(i,i+1));
        //     i++;
        // }

        //////////////////////////////////////
    }
}
