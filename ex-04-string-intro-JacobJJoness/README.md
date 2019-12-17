## String Objects: Concatenation, Literals and More

## Objectives:
At the end of this project, you should:
* Know how to instantiate String objects
* Know how to use the concatenation operator to combine Strings with other Strings, or with other types
* Know how to use escape codes to include certain special characters in a String
* Be able to use String methods to perform operations on and with String objects

## 10 THINGS you should know about STRINGS (in no particular order)...
### Note: Each of the things below has code examples, in the class `StringExamples.java`.  You should remove the appropriate comments in that file (they are numbered) and compile and run them as you go.
1. `String` objects can be created using string literals or by calling the `String` class constructor.
``` Java
String exampleOneA = "This is a String literal";
String exampleOneB = new String("This is using the String class constructor");
```

2. `String` objects are **immutable**, meaning that `String` methods do *not* change the `String` object.
``` Java
String exampleTwo = "Here is a sentence.";
exampleTwo.toUpperCase(); // call the toUpperCase method on exampleThree
System.out.println(exampleTwo); // still prints the original sentence
```

3. `String` objects can be concatenated using the `+` or `+=` operator, resulting *in a new `String` object*.
``` Java
String exampleThreeA = "What would you";
String exampleThreeB = " do for a Klondike bar?";
System.out.println(exampleThreeA);
System.out.println(exampleThreeB);


String exampleThreeC = exampleThreeA + exampleThreeB;
// exampleThreeC is a WHOLE NEW STRING containing the
// values from exampleThreeA and exampleThreeB
System.out.println(exampleThreeC);

exampleThreeA += exampleThreeB;
// exampleThreeA is now a WHOLE NEW STRING containing the 
// values that used to be in exampleThreeA and exampleThreeB
System.out.println(exampleThreeA); 
```

4. Primitive values can be concatenated with a `String` object.  This causes *implicit conversion* (ie. it happens automatically) of the values to `String` objects.
``` Java
int i = 3;
double d = 2.5;
boolean b = true;
String exampleFourA = "The integer: " + i;
String exampleFourB = "The double: " + d;
String exampleFourC = "The boolean: " + b;
// the int, boolean, and double are automatically converted into Strings 
// so they can be concatenated. 
System.out.println(exampleFourA);
System.out.println(exampleFourB);
System.out.println(exampleFourC);
```

5. Escape sequences (or codes) start with a `\` and have a special meaning in Java.  Escape sequences used in this course include `\"`, `\\`, `\t`, and `\n`.
``` Java
// \" is used to insert a quotation mark
String exampleFiveA = "Bill Gates never actually said, \""640K ought to be enough for anybody.\"";

// \\ is used for inserting a backslash
String exampleFiveB = "4 \\ 2 is 2";

// \t is used to insert a tab (usually 4 spaces, but depends on the setup)
String exampleFiveC = "\tThis is useful for indenting text\tor for spacing things out!";

// \n inserts a linebreak (newline) in the string
String exampleFiveD = "Line one\nLine two\nLine three";

System.out.println(exampleFiveA);
System.out.println(exampleFiveB);
System.out.println(exampleFiveC);
System.out.println(exampleFiveD);
```

6. Application programming interfaces (APIs) and libraries simplify complex programming tasks.
    * Documentation fo APIs and libraries are essential to understanding the attributes and behaviors of an object of a class.
    * Classes in the APIs and libraries are grouped into packages.
    * The `String` class is part of the `java.lang` package. Classes in the `java.lang` package are available by default.
    * The Java [String API](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) has an exhaustive list of all of the methods that can be performed on `String` objects.  Take a few minutes to scan through the API and the list of available methods.  It's good to have an idea what types of methods already exist, so you don't waste time reinventing the wheel!

7. A `String` object has index values from `0` to `length - 1`.  Attempting to access indices outside this range will result in an `IndexOutOfBoundsException`.
``` Java
String exampleSeven = "This String has 36 characters in it.";
System.out.println(exampleSeven.length());

System.out.println(exampleSeven.charAt(0));  // prints 'T'
System.out.println(exampleSeven.charAt(35));  // prints '.'
System.out.println(exampleSeven.charAt(-1));  // StringIndexOutOfBoundsException
System.out.println(exampleSeven.charAt(36));  // StringIndexOutOfBoundsException
```

8. A `String` object can be concatenated with an object reference, which implicitly calls the referenced object's `toString` method.  (We will get to this later!)
``` Java
Integer myInt = new Integer(10);
String exampleEightA = "myInt is an Integer (a \"wrapper\" class) with a value of " + myInt; 
String exampleEightB = "myInt is an Integer (a \"wrapper\" class) with a value of " + myInt.toString(); // invoking toString is unnecessary! 
System.out.println(exampleEightA);
System.out.println(exampleEightB);
```

9. The following `String` methods and constructors -- including what they do and how they are used -- are parts of the "Java Quick Reference" and are testable on the AP exam:
    * `String(String str)` -- Constructs a new `String` object that represents the same sequence of characters as `str`
    * `int length()` -- Returns the number of characters in a `String` object
    * `String substring(int from, int to)` -- Returns the substring beginning at index `from` and ending at index `to - 1`
    * `String substring(int from)` --  Returns the substring beginning at index `from` to the end of the string
    * `int indexOf(String str)` -- Returns the index of the first occurence of `str`; returns `-1` if `str` is not found
    * `boolean equals(String other)` -- Returns `true` if this `String` object is equal to `other` and `false` otherwise
    * `int compareTo(String other)` -- Returns a negative value if this String would appear before `other` in the dictionary; returns zero if this `String` object is equal to `other`; returns a positive value if this `String` would appear after `other` in the dictionary  

``` Java
// You can use the constructor to create a String
// or you can use a literal String
String exampleNineA = new String("This is a String.");
String exampleNineB = "This is also a String.";

// Call the length() method on the string object using
// "dot" notation
int lengthOfExampleNineA = exampleNineA.length();
System.out.println("exampleNineA is " + lengthOfExampleNineA + " characters long.");

// Get a substring starting at index 3 and stopping at index 8
// This is a String.
// 01234567891111111
//           0123456
String exampleNineC = exampleNineA.substring(3, 9); // "s is a" 
System.out.println(exampleNineC);

// Get a substring starting at index 9 and going to the end
String exampleNineD = exampleNineA.substring(9); // " String." 
System.out.println(exampleNineD);

// Find the FIRST occurence of the substring "is"
int whereisIs = exampleNineA.indexOf("is"); 
System.out.println("is is at index " + whereisIs);  // why is it 2?

// Remember, everything is "case sensitive" ie. capital and lowercase are DIFFERENT
int whereIsIsnt = exampleNineA.indexOf("Is");
System.out.println("this should be negative one: " + whereIsIsnt);

// >, <, == operators do NOT work correctly with Strings
// They compare the REFERENCE address (memory), not the actual
// letters in the String
String exampleNineE = "Never use the == operator with Strings!";
String exampleNineF = new String("Never use the == operator with Strings!");
System.out.println(exampleNineE.equals(exampleNineF));
System.out.println(exampleNineE == exampleNineF);

// Change the following strings to see how compareTo works
String exampleNineG = "This starts with a T";
String exampleNineH = "this starts with a t";
System.out.println(exampleNineG.compareTo(exampleNineH));
```

10. A string identical to the single element substring at position `index` can be created by calling `substring(index, index+1)`

``` Java
// This code will print out one letter
// at a time from the string
String exampleTen = "ABCDEFGHIJKLMNOP";
int i = 0;
while(i < exampleTen.length()) {
    System.out.println(exampleTen.substring(i,i+1));
    i++;
}
```
## Assignment

### Part 1 
First, to put these concepts into practice, you will complete some exercises on [CodingBat.com](https://codingbat.com/java/String-1).  
1. If you don't have an account, create one using your PERSONAL E-MAIL (NOT SCHOOL)
2. Log-in
3. Update your profile and link your account to mine:
   * Click "prefs"
   * Under Teacher Share put `cpurdy@flourbluffschools.org` 
   * Click the "Share" button
   * Enter your name:  Last, First in the "Memo" section
   * Click "Update Memo" button
4. Complete all of the problems on the Java tab in the [String-1](https://codingbat.com/java/String-1) section.  **You should not use any loops to complete the activities.** 

### Part 2
Next, go to RuneStone Academy APCSA review [4.3 String methods on the exam](https://runestone.academy/runestone/books/published/apcsareview/Strings/sMethods.html) and do the exercises, checking your answers as you go.  

### Part 3
Finally, go to [Practice-It](https://practiceit.cs.washington.edu/) and create an account, using your personal e-mail address.  You will need to check your e-mail to verify your account once it's created.

Once you have verified your account, login and go to Building Java Programs, 4th Edition, Chapter 3 [Self-Check 3.18](https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/s18-jamesTKirk), [Self-Check 3.19](https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/s19-stringExpressions) and [Self-Check 3.20](https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/s20-stringExpressions2)


### When you have finished ALL of the above, mark this assignment as complete on Google Classroom.