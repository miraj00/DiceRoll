// import java.io.*;
import java.util.Scanner;


public class GenerateRandomDieRoll {

	
	public static void randomDiceRolled(int number) {
		
		int i;
		for (i=0; i<2; i++) {
					
		System.out.println( (int) (Math.random() * number));

		
		}
	}
	
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Welcome to the Grand Circus Casino!  " );	
		
		System.out.print(" How many sides should each die have?: ");		
		num = sc.nextInt();
		
		randomDiceRolled(num);
		
		
		
	
	    System.out.print("Roll Again ? (Y/N) : "); 
        String var= sc.next();
   
        if(var.equalsIgnoreCase("Y")){                      // Matches "Y" or "y"
     		main(null);                                     // if input is Y then call main method again to repeat questionaire. 
        } else {
			System.out.println("Bye !");
		}
	
	}	
}











/*  ======================================  Requirements ===================================================================================
Dice Roller
Methods
Task: Create an application that simulates dice rolling.

What will the application do?
Ask the user to enter the number of sides for a pair of dice. 
Prompt the user to roll the dice.
“Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.

Build Specifications
Define a static method named generateRandomDieRoll. It has a parameter that specifies the number of sides on a die and returns a random number between 1 and that number. Call this method for each die that is rolled.
Experiment with different Random number generators–start with the random() method of the Math class but also explore Java’s Random class. 

Extended Challenges:
Display special messages for craps, snake eyes, and box cars.
Break the code up into more methods!

Console Preview: 
Welcome to the Grand Circus Casino!  

How many sides should each die have?  {User input, for example 6}

Roll 1:
2
5

Roll again? (y/n): ...




*/









