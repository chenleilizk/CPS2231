import java.util.Scanner;
//Purpose:print the number if it is within the boundary(5,26)
public class BoundaryNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1.get one number from user
		System.out.println("the number from the user : ");
		double num=input.nextDouble();
		
		//2.show the result
		System.out.println("the number is "+ Math.min(Math.max(num,5),26));
				
	}

}

