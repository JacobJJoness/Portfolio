# Math Fun!

## Learning Objectives:
At the end of this project, you should:
* partially understand the purpose of Integer and Double wrapper classes
* be able to explain autoboxing and unboxing features of the Integer and Double wrapper classes
* understand the methods available with the Integer and Double wrapper classes, including their constructors
* be able to use *static* methods from the `Math` library
   * Math.sqrt
   * Math.abs
   * Math.pow
   * Math.random
   
## Important Information that is hard to demonstrate in a project but you still need to know:

1. A wrapper class is a class whose objects contain a primitive data type.
   * When we instantiate a wrapper class, its only attribute is a primitive data type.
   * Every primite data type has a correspoding wrapper class:
       * `Integer` wraps `int`
       * `Double` wraps `double`
       * `Long` wraps `long`
       * `Character` wraps `char`
       * `Float` wraps `float`
       * `Boolean` wraps `boolean`
       * `Short` wraps `short`
       * `Byte` wraps `byte`
       
       See the pattern?
   * You only need to know about `Integer` and `Double` for the AP exam.
   * Generally you will want to use the primitive data type when just storing values.  The wrapper class is used for data storage methods that *require* an object, e.g. an `ArrayList` (we'll get to that later).
2.  In Java 8 (which is apparently what is tested on the AP exam), you could instantiate wrapper classes using constructors:
      ``` Java
      Integer num1 = new Integer(5);
      Integer num2 = new Integer("5");
      Double num3 = new Double(3.0);
      Double num4 = new Double("3.0");
       ```
      However, if you try these commands on Java 11 (what is on your computers), you will get an error that the constructors are deprecated...another word for outdated and shouldn't be used.  

      For purposes of the AP exam, be aware that the code above IS ALLOWED and DOES WORK!
3.  The `Integer` wrapper class some *static* fields:
    * `Integer.MIN_VALUE` - the minimum value represented by an `int` or `Integer`
    * `Integer.MAX_VALUE` - the maximum value represented by an `int` or `Integer`
    * Assigning a value greater than `Integer.MAX_VALUE` or less than `Integer.MIN_VALUE` to an `int` or `Integer` will result in *integer overflow*.  This can be the source of lots of different bugs in a program!

      **Note**: Static means that you do NOT instantiate an `Integer` object to use it.

4.  The `Integer` and `Double` classes also has some *static* methods:
    * `int Integer.intValue()` - returns the value of the `Integer` as an `int`
    * `double Double.doubleValue()` - returns the value of the `Double` as a `double`
    * `int Integer.parseInt(String str)` - returns the int value of the given string
    * `string Integer.toBinaryString(int i)` - returns the binary representation of the specified `int` value (does that sound familiar?)
    * `Integer valueOf(int i)` - returns an `Integer` instance representing the specified `int` value - this replaced the constructor as of Java 9
    * `Integer valueOf(String s)` - returns an `Integer` object holding the value of the specifed `String` - this replaced the constructor as of Java 9

5.  *Autoboxing* is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes.  This includes converting an `int` to an `Integer` and a `double` to a `Double`.
    * The Java compiler applies autoboxing when a primitive value is:
       * Passed as a parameter to a method that expects an object of the corresponding wrapper class
       * Assigned to a variable of the corresponding wrapper class

6.  *Unboxing* is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type.  This includes converting an `Integer` to an `int` and a `Double` to a `double`.
    * The Java compiler applies unboxing when a wrapper class object is:
       * Passed as a parameter to a method that expects a value of the corresponding primitive type
       * Assigned to a variable of the corresponding primitive type


    **Moral of the Story**: If a method is expecting either a primitive or a wrapper, passing either one will work just fine!


## Math Class
* The `Math` class is in `Java.lang`, which means you don't need to do any imports or anything to use it. 
* The `Math` class has multiple useful *static* methods (it contains only static methods).
    * A static method, is a method that can be called without instantiating an object of the corresponding class.
    * Static methods have a signature like this: 
      ``` Java
      public static int max(int a, int b)
      ```
    * Static methods are called using the dot operator along with the class name unless they are defined in the enclosing class:
      ``` Java
      Math.min(5, 10)
      ```
      would call the `min` static method in the `Math` class.
* The following static `Math` methods -- including what they do and when they are used -- testable:
    * `int abs(int x)` - returns the absolute value of an `int` value
    * `double abs(double x)` - returns the absolute value of a `double` value
    * `double pow(double base, double exponent)` - returns the value of the first parameter raised to the power of the second
    * `double sqrt(double x)` - returns the positive square root of a `double` value
    * `double random()` - returns a `double` value greater than or equal to `0.0` and less than `1.0`
        * The values returned by `Math.random` can be manipulated to produce a random `int` or `double` in a defined range


## Assignment Program:

Use the static methods from the `Math` library to complete the methods described in the `MathFun.java` class.  You **may not** use any external classes or methods besides those provided in the `Math` library.  You can compile and run `MathFun.java` (I included a `main` function with some test cases.)

Once all of your methods in `MathFun.java` appear to be working correctly, take a look at `MathFunGame.java`.  It has a few new concepts that you may find useful for your own projects and for future asignments.  You will need to compile and run `MathFunGame.java` from the command line to use it.
   
  

