import java.util.Scanner;
//Purpose:plays the popular scissor¨Crock¨Cpaper game with the computer
//generate a number 0, 1, or 2 representing scissor, rock, and paper.
public class PlayGame {

	public static void main(String[] args) {
		
		//get the number from the computer
		double number1 = Math.random() * 3;
		System.out.println("the computer is ");
		
		//get the number from the user
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("scissor(0),rock(1),paper(2): ");
		
		//show the result
		switch(number) {
		case 1:System.out.println("The computer is scissor");break;
		case 2:System.out.println("The computer is rock");break;
		case 3:System.out.println("The computer is paper");break;
		
		}
	}

	 

}
