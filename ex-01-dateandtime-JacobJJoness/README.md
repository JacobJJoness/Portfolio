# AP Computer Science A
## Date.java & Time.java

## Objectives
### After completing this project, you should:
* know the syntax for defining a class in Java
* know the syntax for the main method in a Java program
* be able to compile and run a Java program
* be able to declare and define integers, doubles, and String variables
* be able to use print, println, and printf to display information in a useful way
* understand how to use concatenation in Java
* be able to do basic math calculations in Java

## Part 1 - Date.java Instructions
1. Clone this repository into your APCSA folder
2. Open the cloned folder in Visual Studio Code
3. Open the file `Date.java`
4. Create something like our "Hello World" program and make sure you can compile and run it
5. In your main method, create variables named `day`, `date`, `month`, and `year`
   - The variable `day` will contain the name of the day of the week (ie. Friday)
   - The variable `date` will contain the day of the month (ie. 13)
   - The variable `month` will contain the name of the month
   - The variable `year` will contain the year
   - You will need to think about the *types* of these variables when you declare them
6. Assign values to those variables that represent today's date
7. Print out each of the variables on a line by itself
   - This is an intermediate step that is useful to make sure everything is working correctly
   - Compile and run your program before moving on
8. Modify your program so that it displays the date in standard American format, for example `Monday, August 26, 2019`.
9. Modify your program so that it *also* displays the date in European format.  
 
The final output of your program should be (with the correct date):
```
 American format:
 Monday, August 26, 2019
 European format:
 Monday, 26 August 2019
```

### Be sure to git add/commit/push when you finish Date.java

 
## Part 2 - Time.java Instructions
1. Create a file called Time.java
2. Create something like our "Hello World" program and make sure you can compile and run it
   - I won't remind you of this from now on, but you pretty much always want to get a "Hello World" type program working first just to catch any typos early on!
3. Create variables named `hour`, `minute`, and `second`.  
4. Assign these variables values that are roughly the current time.
   - Use a 24-hour clock, so at 2pm the value of `hour` is 14
5. Make the program calculate and display the number of seconds since midnight.
6. Calculate and display the number of seconds remaining in the day.
7. Calculate and display the percentage of the day that has passed.  Have your percentage display only 2 decimal places.
8. Create new variables `endHour`, `endMinute`, and `endSecond` and set them to roughly the current time.  Then write code to compute the elapsed time since you started working on the exercise.  
 
**Note 1**: You should use a double for the percentage, and printf for displaying some of the values.  You can also use concatenation as needed.
 
**Note 2**: You may need to use additional (temporary) variables to hold values during computation. They still need to be declared (type) before you can use them!
 
The final output for your program should look something like:
 ```
 There have been about 34,123 seconds since midnight.
 There are about seconds 52,277 seconds left in the day.
 Approximately 42.38% of the day has passed.
 It took me about 0 hours, 27 minutes, 38 seconds to complete this exercise, wow that's not long at all!
 ```
 
### Be sure to git add/commit/push when you finish Time.java
