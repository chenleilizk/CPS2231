import java.util.Scanner;
//Purpose:compute the biggest between five numbers
public class LargestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1.get five numbers from user
		System.out.println("the five numbers from the user : ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		double num4=input.nextDouble();
		double num5=input.nextDouble();
		
		//2.show the result
		System.out.println("the bigger number is "+ Math.max(num1,num2));
		System.out.println("the bigger number is "+ Math.max(num3,num4));
		System.out.println("the bigger number is "+ Math.max(Math.max(num1,num2),Math.max(num3,num4)));
		System.out.println("the biggest number is "+ Math.max(Math.max(Math.max(num1,num2),Math.max(num3,num4)),num5));
	}

}
