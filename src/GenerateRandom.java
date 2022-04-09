import java.util.Scanner;
//Purpose:Generate a random double numeric value with [0,10)
public class GenerateRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//step 1: Generate two random
		double number1 = Math.random() * 10;
		
		//step 2:show the result
		System.out.println("the number is " + number1);
	}

}
