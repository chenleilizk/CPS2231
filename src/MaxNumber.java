import java.util.Scanner;
//Purpose:compute the bigger between two numbers
public class MaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1.get two numbers from user
		System.out.println("the two numbers from the user : ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		//2.show the result
		System.out.println("the bigger number is "+ Math.max(num1, num2));
	}

}
