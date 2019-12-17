# Classes

Whenever you define a new class, you are also creating a new type with the same name.  So way back in August, when we defined a class `Hello`, we created a type named `Hello`.  

We didn't declare any variables with type `Hello`, and we didn't use `new` to create a `Hello` object.  It wouldn't have done much if we had -- but we could have.

We will now define classes that represent *useful* object types.  We will also review the difference between classes and objects.  Here are the most important ideas:

* Defining a **class** creates a new object type with the same name.
* Every object belongs to some object type; that is, it is an **instance** of some class.
* A class definition is like a template for objects: it specifies what attributes the objects have and what methods can operate on them.
* The `new` operator **instantiates** objects, that is, it creates new instances of a class.
* Think of a class like a blueprint for a house: you can use the same blueprint to build any number of houses.
* The methods that operate on an object type are defined in the class for that object.

---
## The `Time` class
One common reason to define a new class is to encapsulate related data in an object that can be treated as a single unit. That way, we can use objects as parameters and return values, rather than passing and returning multiple values. This design principle is called **data encapsulation**.

We have already seen two types that encapsulate data in this way: `Point` and `Rectangle`. Another example, which we will implement ourselves, is `Time`, which represents a time of day. The data encapsulated in a `Time` object are an hour, a minute, and a number of seconds. Because every `Time` object contains these data, we define attributes to hold them.

Attributes are also called **instance variables**, because each instance has its own variable (as opposed to *class variables*).

The first step is to decide what type each instance variable should be.  It seems clear that `hour` and `minute` should be integers.  Let's make `second` a `double`.

Instance variables are declared at the beginning of the class definition, outside of any method.  By itself, this code fragment is a legal class definition:
``` java
public class Time {
    private int hour;
    private int minute;
    private double second;
}
```
The `Time` class is `public`, which means that it can be used in other classes.  But the instance variables are `private`, which means they can only be accessed from inside the `Time` class.  If you try to read or write them from another class, you will get a compiler error.

Private instance variables help keep classes isolated from each other so that changes in one class won't require changes in other classes.  It also simplifies what other programmers need to understand in order to use your classes.  This kind of isolation is called **information hiding**.

## Constructors
After declaring the instance variables, the next step is to define a **constructor**, which is a special method that initializes the instance variables.  The syntax for constructors is similar to that of other methods, except:
* The name of the constructor is the same as the name of the class.
* Constructors have no return type (and no return value).
* The key word `static` is omitted.

Here is an example constructor for the `Time` class:
``` java
public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
}
```
This constructor does not take any arguments.  Each line initializes an instance variable to zero (which in this example means midnight).

The name `this` is a key word that refers to the object we are creating.  It is analagous to `self` in Python.  You can use `this` the same way you use the name of any other object.  

For example, you can read and write the instance variables of `this` and you can pass `this` as an argument to other methods. But you do not declare `this`, and you can't make an assignment to it.

A common error when writing constructors is to put a `return` statement at the end.  Like void methods, constructors do not return values.

To create a `Time` object, you must use the `new` operator:
``` java
Time time = new Time();
```
When you invoke `new`, Java creates the object and calls your constructor to initialize the instance variables.  When the constructor is done, `new` returns a reference to the new object.  In this example, the reference gets assigned to the variable `time`, which has type `Time`.

## More Constructors
Like other methods, constructors can be overloaded, which means you can provide multiple constructors with different parameters.  Java knows which constructor to invoke by matching the arguments you provide with the parameters of the constructors.

It is common to provide a constructor that takes no arguments (like the one above) and a "value constructor" like this one:
``` java
public Time(int hour, int minute, double second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}
```
All this constructor does is copy values from the parameters to the instance variables.  In this example, the names and types of the parameters are the same as the instance variables.  As a result, the parameters **shadow** the instance variables, so the keyword `this` is necessary to tell them apart. *Parameters don't have to use the same names, but that's common style.*

To invoke this second constructor, you have to provide arguments after the `new` operator.  This example create a `Time` object that represents a fraction of a second before noon:
``` java
Time time = new Time(11, 59, 59.9);
```
Overloading constructors provides the flexibility to create an object first and then fill in the attributes, or collect all the information before creating the object itself.

Here is the complete class definition so far:
``` java
public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
```
## Getters and setters
Recall that the instance variables of `Time` are `private`.  We can access them from within the `Time` class, but if we try to access them from another class, the compiler generates an error.

For example, here's a new class called `TimeClient`.  A class that uses objects defined in another class is called a **client**.
``` java
public class TimeClient {
    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.9);
        System.out.println(time.hour);    // compiler error
    }
}
```
If you try to compile this code, you will get a message like `hour has private access in Time`.  This is very different from Python, where there is really no such thing as a `private` instance variable (everything is public!).

There are three ways to solve this problem:
* We could make the instance variable `public`.
* We could provide methods to access the instance variables.
* We could decide that it's not a problem and refuse to let other classes access the instance variables.

The first choice sounds good because it's simple.  But the problem is that when Class *A* accesses the instance variables of Class *B* directly, *A* becomes "dependent" on *B*.  If anything in *B* changes later, it is likely that *A* will have to change too.

But if *A* only uses methods to interact with *B*, *A* and *B* are "independent", which means that we can make changes in *B* without affecting *A* (as long as we don't change the method signatures).

So if we decide that `TimeClient` should be able to read the instance variables of `Time`, we can provide methods to do it:
``` java
public int getHour() {
    return this.hour;
}

public int getMinute() {
    return this.minute;
}

public double getSecond() {
    return this.second;
}
```
Methods like this are called **accessors** but are also known informally as "getters".  By convention, the method that gets a variable named `something` is called `getSomething`.

If we decide that `TimeClient` should also be able to modify the instance variables of `Time`, we can provide methods to do that too:
``` java
public void setHour(int hour) {
    this.hour = hour;
}

public void setMinute(int minute) {
    this.minute = minute;
}

public void setSecond(double second) {
    this.second = second;
}
```
These methods are called **mutators** but are also known informally as "setters".  The naming convention is similar; the method that sets `something` is usually called `setSomething`.

## Displaying objects
If you create a `Time` object and display it with `println`:
``` java
public static void main(String[] args) {
    Time time = new Time(11, 59, 59.9);
    System.out.println(time);
}
```
The output will look something like:
``` java
Time@80cc7c0
```
When Java displays the value of an object type, it displays the type and the address of the object (in hexadecimal).  This address can be useful for debugging, if you want to keep track of individual objects.

To display `Time` objects in a way that is more meaningful to users, you could write a method to display the hour, minute, and second:
``` java
public static void printTime(Time t) {
    System.out.printf("%02d:%02d:04.1f\n", t.hour, t.minute, t.second);
}
```
As a reminder, you need to use %d with integers and %f with floating-point numbers. The 02 option means “total width 2, with leading zeros if necessary”, and the 04.1 option means “total width 4, one digit after the decimal point, leading zeros if necessary”.

## The `toString` method
Every object type has a method called `toString` that returns a string representation of the object (this was `__str__` in Python).  When you display an object using `print` or `println`, Java invokes the object's `toString` method.

By default it displays the type of the object and its address, but you can **override** this behavior by providing your own `toString` method.  For example, here is a `toString` method for Time:
``` java
public String toString() {
    return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
}
```
The definition does not have the key word `static`, because it is not a static method.  It is an **instance method**, because when you invoke it, you invoke it on an instance of the class.  Instance methods are sometimes called "non-static"; you might see this term in an error message.

The body of the method is similar to `printTime`, with two changes:
* Inside the body, we use `this` to refer to the current instance; that is, the object the method is invoked on.
* Instead of `printf`, it uses `String.format`, which returns a formatted `String` rather than displaying it.

Now you can call `toString` directly:
``` java
Time time = new Time(11, 59, 59.9);
String s = time.toString();
```
or you can invoke it indirectly through `println`:
``` java
System.out.println(time);
```

## The `equals` method
We have seen two ways to check whether values are equal: the `==` operator and the `equals` method.  With objects you can use either one, but **they are not the same**.
* The `==` operator checks whether the objects are **identical**; that is, whether they are the *same object*.
* The `equals` method checks whether they are **equivalent**; that is whether they have the same value.

The definition of identity is always the same, so the `==` operator always does the same thing.  But the definition of equivalence is different for different objects, so objects can define their own `equals` methods.

Consider the following variables:
``` java
Time time1 = new Time(9, 30, 0.0);
Time time2 = time1;
Time time3 = new Time(9, 30, 0.0);
```
The assignment operator copies references, so `time1` and `time2` refer to the same object.  Because they are identical, `time1 == time2` is `true`.

But `time1` and `time3` are different objects.  Because they are not identical, `time1 == time3` is `false`.

By default, the `equals` method does the same thing as `==`.  For `Time` objects, that's probably not what we want.  For example, `time1` and `time3` represent the same time of day, so we should consider them equivalent.

We can provide an `equals` method that implements this:
``` java
public boolean equals(Time that) {
    return this.hour == that.hour 
        && this.minute == that.minute
        && this.second == that.second;
}
```
`equals` is an instance method, so its uses of `this` refer to the current object and it doesn't have the key word `static`.  We invoke `equals` as follows:
``` java
time1.equals(time3);
```
Inside the `equals` method, `this` refers to `time1` and `that` refers to `time3`.  Since their instance variables are equal, the result is `true`.

Many objects use a similar idea of equivalence; that is, two objects are equivalent if their instance variables are equal.  But other definitions are possible.

## Adding times
Suppose you are going to a movie that starts at 18:50 (or 6:50 PM), and the running time is 2 hours and 16 minutes.  What time does the movie end?

We'll use `Time` objects to figure it out.  Here are two ways we could "add" `Time` objects:
* We could write a static method that takes two `Time` objects as parameters.
* We could write an instance method that gets invoked on one object and takes the other as a parameter.

To demonstrate the differences, we'll do both!  

Here is the `static` approach:
``` java
public static Time add(Time t1, Time t2) {
    Time sum = new Time();
    sum.hour = t1.hour + t2.hour;
    sum.minute = t1.minute + t2.minute;
    sum.second = t1.second + t2.second;
    return sum;
}
```
And here's how we would call the static method:
``` java
Time startTime = new Time(18, 50, 0.0);
Time runningTime = new Time(2, 16, 0.0);
Time endTime = Time.add(startTime, runningTime);
```

Here's what the instance method looks like:
``` java
public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;
    return sum;
}
```
The changes are:
* We removed the key word `static`
* We removed the first parameter.
* We replaced `t1` with `this`.

Optionally, you could replace `t2` with `that`.  Unlike `this`, `that` is not a key word; it's just a slightly clever variable name.

And here's how we would call the instance method:
``` java
Time endTime = startTime.add(runningTime);
```
That's all there is to it.  Static methods and instance methods do the same thing, and you can convert from one to the other with just a few changes.

There's only one problem: the addition code itself is incorrect.  For this example, it returns `20:66`, which is not a valid time.  If `second` exceeds `59.9` we have to "carry" to the minutes column, and if `minute` exceeds `59`, we have to carry into `hour`.

Here is a better version of `add`:
``` java
public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;
    
    if (sum.second >= 60.0) {
        sum.second -= 60.0;
        sum.minute += 1;
    }

    if (sum.minute >= 60) {
        sum.minute -= 60;
        sum.hour += 1;
    }
return sum;
}
```
It's still possible that `hour` may exceed 23, but there's no day attribute to carry into.  In that case, `sum.hour %= 24` would yield the correct result.

## Pure methods and modifiers
This implementation of `add` does not modify either of the parameters.  Instead, it creates and returns a new `Time` object.  As an alternative, we could have written a method like this:

``` java
public void increment(double seconds) {
    this.second += seconds;
    while(this.second >= 60.0) {
        this.second -= 60.0;
        this.minute += 1;
    }
    while(this.minute >= 60) {
        this.minute -= 60;
        this.hour += 1;
    }
}
```
The `increment` method modifies an existing `Time` object.  It doesn't create a new one and it doesn't return anything.

In contrast, methods like `add` are called **pure methods** because:
* They don't modify the parameters
* They don't have any other side effects like printing
* The return value only depends on the parameters, not on any other state.

Methods like `increment`, which break the first rule, are sometimes called **modifiers**.  They are usually void methods, but sometimes they return a reference to the object they modify.

Modifiers can be more efficient because they don't create new objects.  But they can also be error-prone.  When objects are aliased, the effects of modifiers can be very confusing.

To make a class immutable, like `String`, you can provide getters but no setters and pure methods but no modifiers.  

All of the code examples above including an example client program can be found in the `Examples` folder.

---

## Assignment

1. Review the documentation of `java.awt.Rectangle`.  Which methods are pure and which are modifers?
    * Pure methods 
        * List starts here
    * Modifiers
        * List starts here

2. The implementation of `increment` in the `Time` class is not very efficient. Rewrite it so it doesn’t use any loops.
    ``` java
    public void increment(double seconds) {
    this.second += seconds;
    if(this.second >= 60.0) {
        this.second = seconds%60.0;
        this.minute += seconds/60;
    }
    if(this.minute >= 60) {
        this.minute = this.minute%60;
        this.hour += this.minute/60;
    }
}
    ```

3. In the board game Scrabble, each tile contains a letter, which is used to spell words in rows and columns, and a score, which is used to determine the value of words.
    1. Write a definition for a class named `Tile` that represents Scrabble tiles.  The instance variables should include a `String` name `letter` and an integer named `value`.
    2. Write a constructor that takes parameters named `letter` and `value` and initializes the instance variables.
    3. Write a method named `printTile` that takes a `Tile` object as a parameter and displays the instance variables in a reader-friendly format.
    4. Implement the `toString` method for a `Tile`; base it on your `printTile` method above.
    5. Implement the `equals` method for a `Tile`.
    6. Create getters and setters for each of the attributes.
    7. Create a new class `TileClient` which tests all of the `Tile` methods you wrote.

3. A rational number is a number that can be represented as
the ratio of two integers. For example, 2/3 is a rational number, and you can think of 7 as a rational number with an implicit 1 in the denominator.
    1. Define a class called `Rational`. A `Rational` object should have two integer instance variables that store the numerator and denominator.
    2. Write a constructor that takes no arguments and that sets the numerator to 0 and denominator to 1.
    3. Write an instance method called printRational that displays a `Rational` in some reasonable format.
    4. Write a `main` method that creates a new object with type `Rational`, sets its instance variables to some values, and displays the object.
    5. At this stage, you have a minimal testable program. Test it and, if necessary, debug it.
    6. Write a `toString` method for `Rational` and test it using `println`.
    7. Write a second constructor that takes two arguments and uses them to initialize the instance variables.
    8. Write an instance method called `negate` that reverses the sign of a rational number. This method should be a modifier, so it should be void. Add lines to main to test the new method.
    9. Write an instance method called `invert` that inverts the number by swapping the numerator and denominator. It should be a modifier. Add lines to main to test the new method.
    10. Write an instance method called `toDouble` that converts the rational number to a `double` and returns the result. This method is a pure method; it does not modify the object. As always, test the new method.
    11. Write an instance method named `reduce` that reduces a rational number to its lowest terms by finding the greatest common divisor (GCD) of the numerator and denominator and dividing through. This method should be a pure method; it should not modify the instance variables of the object on which it is invoked.

        Hint: Finding the GCD only takes a few lines of code. Search the web for “Euclidean algorithm”.

    12. Write an instance method called `add` that takes a `Rational` number as an argument, adds it to `this`, and returns a new `Rational` object. There are several ways to add fractions. You can use any one you want, but you should make sure that the result of the operation is reduced so that the numerator and denominator have no common divisor (other than 1). Test it.

    13. Write an instance method called `subtract` that takes a `Rational` number as an argument, subtracts it from `this`, and returns a new `Rational` object.  This method should use your previously defined methods wherever possible.  Again, you should make sure that the result of the operation is reduced.  Test it.

    14. Write an instance method called 'multiply' that takes a `Rational` number as an argument, multiplies it by `this` and returns a new `Rational` object.  Make sure the result is reduced.  Test it.

    15. Write an instance method called 'divide' that takes a `Rational` number as an argument, divides it by `this` and returns a new `Rational` object.  Make sure the result is reduced. Test it.