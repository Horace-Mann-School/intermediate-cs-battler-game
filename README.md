# Intermediate CS Battler Game

## Part 1: Character.java

**Today's Task**: Create a Character class with multiple instance variables (fields) representing the fundamentals of a character as shown by your UML diagram. Include a constructor method to set these values and test these values in your Runner.java file, and a toString() method that will show the Character's stats.

You will be asked to turn in: 
- A photo of the UML diagram
- A pull request of your code that has a commit history on Github
- The answers to the reflection questions

Check Google Classroom for how those portions will be submitted.

## Part 2: Enemy.java
### Objective
Students will create an Enemy class and revise the Character class to improve encapsulation
You will turn in:
- A revised Character and Enemy class in the shared repository
- A photo of your updated UML diagrams
- A pull request of your code that has a commit history on Github
- Reflection question answers submitted in a Google Document to Classroom

**A successful submission of these assignments is necessary for a full grade; failure to submit all requirements on time will result in a late-grade penalty.**

### Specifications: 
Player.java should be revised to support encapsulation. Your Player class should include:
- Accessor and mutator methods for values that should be changed
- Validation included in each mutator method to constrain values to be non-negative
- A revised constructor that calls the mutator methods to validate the data
- Enemy.java should largely mirror Player.java. Students will largely copy and paste this logic
- A Runner.java file where students will call the attack accessor method for the Character and use that returned value to lower the HP of the Enemy. Then, the Enemy should do the same to the Character. 
- Both should only allow the attack to occur if the HP is zero

### Reflection Questions: 
Answer these in a separate Google Doc attached to the assignment.
- Why is it useful to encapsulate classes by setting their fields to private?
- Why do you think we have the battle occurring in Runner, and not in Character or Enemy?
- For our game, right now we have a Character and Enemy just hitting each other with their attack, and lowering their HP. Give me at least 2 ways we could add in functionality to make this more dynamic and interesting.
