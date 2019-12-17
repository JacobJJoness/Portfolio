## 2019-2020 AP Computer Science A 
## 2nd 6 Weeks Test

You are to implement a class to represent a Complex number and some methods to act on Complex numbers.  

A **complex number** is a number that can be expressed in the form `a + bi`, where `a` and `b` are real numbers, and `i` is a solution of the equation x<sup>2</sup> = −1.

## Requirements

1. The `Complex` class should have two integer instance variables `a` and `b`.
2. The "no parameter" constructor should initialize `a` and `b` to 0. 
3. Another constructor should be created that has two parameters and initializes `a` and `b` to the two parameters.
4. Create a `toString` instance method which returns an appropriate `String` representation of the `Complex` number:
    * if `a` or `b` is 0, it should show the non-zero part (if they are both 0, display `0`)
    * if `b` is negative, it should show `a - bi` (not `a + -bi`).
    * if `b` is one, it should not show a coefficient (`a + i` or `a - i`).
    * Remember you can use `String.format` to create a formatted String (like `printf` but without the print).
5. Create an `equals` instance method which returns `true` if the passed in `Complex` number is equal to `this` `Complex` number.  Two complex numbers are considered equal if their components (a and b) are equal.
6. Create an instance method `conjugate` which returns a new `Complex` number that is the *conjugate* of `this` `Complex` number.  The complex conjugate of the complex number `a + bi` is given by `a − bi`.
7. Create a static method `add` which takes in two complex numbers and returns their sum:
    
    `(a + bi) + (c + di) = (a+c) + (b+d)i`
8. Create a static method `subtract` which takes in two complex numbers and returns their difference:

    `(a + bi) - (c + di) = (a-c) + (b-d)i`
9. Create a void mutator instance method `multiply` which takes in another `Complex` number and multiplies `this` `Complex` number by it.  
    `(a + bi) * (c + di) = (a*c - b*d) + (a*d + b*c)i`

10. Create a static method `pow` that takes in a `Complex` number, `c` and an integer, `n`, and returns c<sup>n</sup>.  Hint: Use the multiply method written in #9 and a loop. 


## Scoring Guidelines
For each numbered part above, a complete and correct implementation will earn 10 points.

Partial credit will be awarded as follows:
* +2 -  Correct method header
* +1 - Correct return *type*
* +5 - Partially correct implementation with minor mathematical error
* +2 - Partially correct implementation with major mathematical error (ie. using wrong operation altogether)

Any methods that fail to compile will earn a maximum of 2 points (correct header).  

Any omitted methods will earn 0 points.

You should use `ComplexClient.java` to test your methods **as you go**.
