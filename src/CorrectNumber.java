import java.util.Scanner;
//purpose: generate an integer between 0 and 100
//         if the guess number is too high or too low,
//         simply print "your guess is too low" or 
//         "your guess is too high"

public class CorrectNumber {

	public static void main(String[] args) {

		//step 1: creat the boundary number between 0 and 100
		int number1 =(int)(Math.random() * 101);
		
		//step 2:get a number from the user
		System.out.println("Guess a magic number between 0 and 100");
		System.out.println("Enter your guess: ");
		Scanner input = new Scanner(System.in);
		int number2 = input.nextInt();
		
		//step 3:print the corresponding message to user
		if(number1<=number2)
			System.out.println("Your guess is too high");
		else {
			System.out.println("Your guess is too low");
			 
		     }
		
	}

}
