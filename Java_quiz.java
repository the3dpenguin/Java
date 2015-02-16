/*Mathematics Quiz application
 by Ushan Dissanayake, 16/02/15*/

//importing the scanner
import java.util.Scanner;

//creating a class
class myclass{
	//main method:
	public static void main(String args[]){
		//creating variables to use with the scanner variable *line 16*
		//these are going to be equal to the answers to the questions (input)
		double q1, q2, q3, q4, q5;
		
		//creating a new scanner to read the user input
		Scanner answer = new Scanner(System.in);
		
		//question 1
		System.out.println("What is the difference: 228 - 128?");
		//setting the variable "q1" equal to the scanner (input)
		q1 = answer.nextDouble();
		
		//creating an if statement for question 1 checking if the input was correct.
		if (q1 == 100){
			System.out.println("Correct!");
			//if the input was the wrong answer:
		}else{
			System.out.println("Incorrect :(");
		}
		
		//same thing...
		System.out.println("What is: 16 x 12 / 2?");
		q2 = answer.nextDouble();
		
		if (q2 == 96){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect :(");
		}
		
		//same thing...
		System.out.println("What is: 222 - 300?");
		q3 = answer.nextDouble();
		
		if (q3 == -78){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect :(");
		}
		
		//same thing...
		System.out.println("What is the square root of: 81?");
		q4 = answer.nextDouble();
		
		if (q4 == 9){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect :(");
		}
		
		//same here...
		System.out.println("49 / x = 7, what is x equal to?");
		q5 = answer.nextDouble();
		
		if (q5 == 7){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect :(");
		}
		//gives the user there result (weather they passed or not)
		System.out.println("Here is you result:");
		//Checking to see the total score.
		if (q1 == 100 && q2 == 96 && q3 == -78 && q4 == 9 && q5 == 7){
			System.out.println("You win! Well done :D");
		}else{
			System.out.println("Sorry, you lose D:");
		}
	}
}
