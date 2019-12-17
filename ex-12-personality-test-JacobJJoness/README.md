# File Processing and Arrays

## Assignment Requirements

The purpose of this assignment is to implement a program that processes responses to a personality test. To do this you will practice the following programming techniques:

* practice creating a structured program.
* practice processing data from files.
* practice using arrays.
* practice formatting output with printf.

## Provided Files:

[sampleData.txt](sampleData.txt) (A small sample data file.)
[expectedOutput.txt](expectedOutput.txt) (The required output for the example sampleData.txt file.)
[Personality.java](Personality.java) (A shell file with a main method and the header information)

**Description:** For this assignment you are limited to 1d arrays. You may not use arrays of more than 1 dimension, or any other *collections* data structure on this assignment.

Write a program that processes an input file of data for a personality test known as the [Meyers-Briggs](https://en.wikipedia.org/wiki/Myers%E2%80%93Briggs_Type_Indicator) and [Keirsey Temperament Sorter](http://en.wikipedia.org/wiki/Keirsey_Temperament_Sorter). The personality test involves answering 70 questions each of which have two answers.  We will refer to them as the “A” answer and the “B” answer.  People taking the test are allowed to leave a question blank, in which case their answer will be recorded with a dash ("-").

[You can take another version of the test at this page.](http://www.humanmetrics.com/cgi-win/JTypes2.asp) According to this version, I am an INTP.

The input file will contain a series of line pairs, one per person.  The first line will have the person’s name (possibly including spaces) and the second line will have a series of 70 letters all in a row (all either "A", "a", "B", "b",  or "-").  Your job is to compute the scores for each of the four personality dimensions and overall result for each person and then display this information to standard output (the screen).

The Keirsey test measures four independent dimensions of personality:

* Extrovert versus Introvert (E vs I): what energizes you

* Sensation versus iNtuition (S vs N): what you focus on

* Thinking versus Feeling (T vs F): how you interpret what you focus on

* Judging versus Perceiving (J vs P): how you approach life

Individuals are categorized as being on one side or the other of each of these dimensions.  The corresponding letters are put together to form a personality type.  For example, if you are an extravert, intuitive, thinking, perceiving person then you are referred to as an ENTP.  Usually the letter used is the first letter of the corresponding word, but notice that because the letter “I” is used for “Introvert”, the letter “N” is used for “iNtuition.”

The Keirsey test involves 70 questions answered either A or B.  The A answers correspond to extravert, sensation, thinking and judging (the left-hand dimensions in the list above).  The B answers correspond to introvert, intuition, feeling and perceiving (the right-hand dimensions in the list above).  For each of these dimensions, we determine a number between 0 and 100 and indicate whether they were closer to the A side or the B side.  The number is computed by figuring out what percentage of B answers the user gave for that dimension (rounded to the nearest integer).

Here is a specific example.  Suppose that someone’s answers divide up as follows:


| Dimension| # of A answers | # of B answers |	% B | Result |
|---|---|---|---|---|
| Extrovert / Introvert | 1 |	9 |	90% |	I |
| Sensation / iNtuition |	17 | 3	| 15% |	S |
| Thinking / Feeling |	18 |	2 |	10% |	T |
| Judging / Perceiving |	18 |	2 |	10% |	J |

These numbers correspond to the answers given by the first person in the sample input file (“Betty Boop”).  We add up the number of each type of answer for each of the four dimensions.  Then compute the percentage of B answers for each dimension.  Then assign letters based on which side the person ends up on for each dimension.  In the Extrovert/Introvert dimension, for example, the person gave 9 “B” answers out of 10 total, which is 90%, which means they end up on the B side which is “Introvert” or I.  In the Sensing/iNtuition dimension the person gave 3 “B” answers out of 20 total, which is 15%, which means they end up on the A side with is “Sensing” or S.  The overall scores for this person are the percentages (90, 15, 10, 10) which works out to a personality type of ISTJ.

Some people will end up with a percentage of exactly 50 in one or more dimensions.  This represents a tie, where the person doesn’t clearly fall on either side.  In this case we use the letter “X” to indicate that the person is in the middle for this particular dimension.  The last two entries in the small sample input file end up with X’s in their personality type.

It is also possible that someone skips all of the questions in an area. There is no way to calculate their percentage in this case. If a data set has zero answers in a given area use the hyphen character "-" for the result in that area. Zero answers on a particular dimension shall not cause a runtime error.

Take a moment to compare the small sample input file and the small sample output file and you will see that each pair of lines in the input file is turned into a single line of output in the output file that reports the person’s name, the list of percentages and the personality type. 

Your program shall read from a input file and output the results to the screen. Your output is required to reproduce the format of the sample output file **exactly**. Use 30 total spaces to output each person's name. If a name contains more than 30 characters, shift the output to the left. [Consider the examples in this file](longNameOutput.txt).

You may assume the format of the input file is as follows:
```
<X>
<name 1>
<answers 1>
<name 2>
<answers 2>
...
<name X>
<answers X>
```
The first line of the file is an `int` that indicates the number of records in the file. If  X is the number of records in a file the file will consist of 2X additional lines. Each pair of lines is one record. The first line of a record is the name of the person. The name can contain any and all characters. The entire line is the name. The next line in the record will be exactly 70 characters followed by a newline character. All of the characters will be either a capital A, a lower case a, a capital B, a lower case b or a hyphen. ('A', 'a', 'B', 'b', or '-')

To count the number of A and B answers for each dimension, you need to know something about the structure of the test.  The test has 10 groups of 7 questions with a repeating pattern in each group of 7 questions.  The first question in each group is an Introvert/Extrovert question (questions 1, 8, 15, 22, etc).  The next two questions are for Sensing/iNtuition (questions 2, 3, 9, 10, 16, 17, 23, 24, etc).  The next two questions are for Thinking/Feeling (questions 4, 5, 11, 12, 18, 19, 25, 26, etc).  And the final two questions in each group are for Judging/Perceiving (questions 6, 7, 13, 14, 20, 21, 27, 28, etc).  Notice that there are half as many Introvert/Extrovert questions as there are for the other three dimensions.  The seventy letters in the input file appear in question order (first letter for question 1, second letter for question 2, third letter for question 3, etc).

Remember that the user might leave a question blank, in which case you will find a dash in the input file for that question.  Dash answers are not included in computing the percentages.  For example, if for one of the dimensions you have 6 A answers, 9 B answers and 5 dashes, you would compute the percentage of B answers as 9 of 15, or 60%.

Round percentages to the nearest integer.  Round by adding one-half and casting to an integer.  For example, if you have a variable of type double named percentage, you can find the nearest integer as follows.
``` java
int percent = (int)(percentage + 0.5);
```
Or you can use the Math.round method. The trouble with this is the round method that takes a double returns a long, so you would have to cast it to an int.
``` java
int percent =(int) Math.round(percent);
```
For this assignment you are to read from a file chosen by the user and write your results to the console using System.out.

You can read the user’s answers from the input file using a call to the method nextLine().  This will read an entire line of input and return it as a String.  You can use the `substring` method of the String class to get the individual characters of this String.

One of the things to keep in mind for this program is that you transform data from one form to another.  This is a fundamental operation and concept in the world of computation and computer programming. You start with a String that has 70 characters in it.  You convert the String into two sets of counters (how many A answers for each dimension, how many B answers for each dimension).  You convert that into a set of percentages.  And you finally convert that into a String that represents the personality type.  If you work through this step by step, the problem will be easier to solve. (Design a little, code a little, test a little. Design a little, code a little, test a little.). Arrays are very useful at most steps in the process so we can effectively **return multiple things from a method in a single array**.

Assume that the input file has no errors.  In particular, assume the file is composed of pairs of lines and that the second line in each pair will have exactly 70 characters that are either A, a, B, b, or dash.

The sample input and output files provide just a few simple examples of how this program works.  I will use a much more extensive file for testing your program. 

I expect you to use good programming style and to include useful comments throughout your program.  I am not specifying how to decompose this problem into methods, but I will be grading on the quality of your decomposition.  That means you will have to decide how to decompose the program into methods.  You don’t want to have redundant code.  You don’t want to have long methods.  You want to break the problem down into logical sub-problems so that someone reading your code can see the sequence of steps it is performing.  For reference, my `Personality` class had 7 methods (including `main` and `getFileScanner`) and is about 160 lines with some whitespace and comments.  You should use proper style: indenting, spacing, good identifiers (variable names), parameters to pass information from one method to another, comments on methods that summarize what they do.

You can find out more about the Keirsey Temperament Sorter at http://www.keirsey.com.

A larger file based on responses from past [UT CS312 Students](largerSample.txt) ([Expected results for this file here](largerSampleExpectedOutput.txt)).

An even larger file with [past CS312 results](evenLargerSample.txt). 

Thanks to Stuart Reges/Mark Scott for sharing this assignment with me.
