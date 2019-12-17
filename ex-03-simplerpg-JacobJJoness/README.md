# A Simple (non) RPG

In this project, you will build upon the provided starter code to make a **very** simple (not really) RPG.  

## Objectives:
At the conclusion of this project, you should:
* understand the difference between and object and a class.
* know how to instantiate a class 
* be able to use the signature to know which constructor is being called
* know how to overload a constructor
* know the difference between formal parameters and actual parameters
* be able to identify valid and invalid calls to a constructor
* understand the parts of a class definition
* understand the purpose of constructor parameters
* be able to call void and non-void methods with and without parameters and know the differences
* understand what the keyword null is used for
* be able to use if/else to check conditions


1. Add a void method to the Hero class called `takeDamage`.  This method should have one parameter, an integer, that is the amount that should be subtracted from the hero's HP.  After subtracting the damage amount, this method should check if the hero's HP is 0 or less.  If it is, this method should change the value of `isAlive` to false. 

2. In `Game.java`, add appropriate calls  to the `takeDamage` method for both Heroes so that they take 15 damage each.

3. Update the `heal` method so that only living heroes may be healed and that the hero's HP never goes over its maximum amount.

4. Add a method called `percentHPLeft` that returns a double which represents the percentage of the Hero's total HP that he/she still has.

5. Update the `displayStatus` method so that, in addition to displaying total HP, it also states what percentage of the Hero's HP is remaining.  You **must** use the `percentHPLeft` method defined in #3 to do this!

6. Add a third constructor for the hero class which has one String parameter, heroName.  This constructor should set the hero's name to heroName, and set hp to 10.

7. In `Game.java`, create a third Hero object, `thirdHero`, and using your constructor from #7, give it your name.  Have this new hero take 5 points of damage.  Then use the heal method, to heal 15.  Finally, use the displayStatus method to show your hero's current status.  Ensure your output is correct, based off of the previous instructions about these methods.

8.  In `Game.java`, create a fourth Hero object, `fourthHero`, that has the name "Hornet" and has 20 HP (level 2).  Have this hero take 30 damage.  Then use the heal method for 20.  Use the displayStatus method to show this hero's current status.  Double check your output is correct, based off of the previous instructions.
