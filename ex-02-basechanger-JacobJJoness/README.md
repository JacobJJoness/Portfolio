## AP Computer Science A
## BaseChanger.java

## Introduction
In this project, you will write two methods: binToDec and decToBin.  These methods will change a given binary number to decimal or vice versa.  

For example, 1001 in base 2 (binary) is equivalent to 9 in base 10 (decimal).

## Objectives
At the end of this project, you should:
* Understand and be able to use primitive types and basic type casting
* Understand and be able to use variables, including appropriate use of camelCase.
* Understand and be able to use while loops in Java
* Review basic arithmetic operators including modulus and integer division
* Be aware of and use helper methods from the Math library
* Know the parts of a method declaration
* Be able to debug basic Java and resolve compile-time errors using the Java compiler (javac)

## Gettings Started Instructions
* Clone this repository into our APCSA folder.  
* Open the folder in Visual Studio Code
* Open the file `BaseChanger.java` -- The starter code already has some of the things below done for you...
* Declare class called BaseChanger.  The comments are in a form called JavaDoc and **should be included**.

``` java
/**
 * The BaseChanger class will have static methods that can
 * be used to convert between Decimal and Binary numbers
 */
public class BaseChanger {

}
```
* Add a main method to the BaseChanger class.  This method should be indented one level.
``` java
  public static void main(String[] args) {

  }
```
* Compile and run your program.
* At this point you will notice that there is a new file in the directory called BaseChanger.class.  This is the **byte code** for your program.  We don't need to upload that or keep track of it in Git; we want Git to ignore that file.  To do this, create a new file in the folder called `.gitignore` and add `*.class` to it.  Be sure to save the file (ctrl s).
* Git add/commit with the commit message "initial commit" and push.
* Inside of the BaseChanger class, but outside of the main method (before it, in fact) let's declare the two methods we will be using:

```java
/** 
 * returns a String representation of the binary value of 
 * the decimal number argument
 *
 * @param decNum the decimal value to be converted
 */
public String decToBin(int decNum) {

    return "0";
    
}

/** 
 * returns the decimal value of 
 * the binary number argument
 *
 * @param binNum the binary value to be converted
 */
public int binToDec(int binNum) {
    
    return 0;
    
}
```
* Compile and run your program - fix any errors that arise.
* Git add/commit/push

## Part 2
At this point, you need to review changing between Binary and Decimal values and work out an algorithm that can be translated into code.  This will be done in class with a group or partner.


## Implementation
Once you have an algorithm, it's time to translate that into Java.  Here are some helpful hints:
* Java has `while` loops and `if` statements:
``` java
while(condition) {
   // do stuff
}

if(condition) {
  // do stuff
}
```
**Note**: The parenthesis () are **required**!

* You can concatenate (join) two strings together using the `+` operator.  This operator can also be used between a string and an integer!
* Remember that in Java all variables must be *declared* before they are used.  This includes stating what their *type* will be.  
* Java has 8 primitive types:
  * Integer (int)
  * Boolean (bool)
  * Double (double)
  * Float (float)
  * Long (long)
  * Byte (byte)
  * Char (char)
  * Short (short)
* Any other type is called a *reference* type:
  * String (String)
* For this program, you are safe using integers (int) and Strings (String); we will discuss the other primitive types as the need arises.
* Java's math library is very useful.  You can access the methods using `Math.nameOfMethod`.  For example `Math.sqrt(16)` will return 4.  For a list of the available methods, you can refer to the [Java API](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) or if you put Math. into VSC, it will have a drop down list of available methods. 

## Testing
The main method in the starter code has 5 test values for each of your methods.  When your program is working correctly, it should be fairly obvious.  You should try to think of any *edge cases* that I may have left out.  

## Submission
When your program is working correctly, be sure to add/commit/push.  Don't forget to add/commit as you get individual features of your program working!
