import java.util.Scanner;
//purpose:Write a program to ask user to enter 20 numbers(integers), then compute the sum of these 
//        numbers and print out the result.
public class TheSumOfIntgers {

	public static void main(String[] args) {
		
		//step 1:get 20 integers from the user
		Scanner input = new Scanner(System.in);
		System.out.println("please enter 20 numbers : ");
		int [] nums = new int [20];
		int sum = 0;
		
		//step 2:computer the sum.
		for(int i = 0;i<20;i++) {
			nums[i] = input.nextInt();
			sum = sum + nums[i];
		}
		
		//step 3:print the sum.
		System.out.println(sum);
		
		//step 4:show the all elements of the arrayr
	}

}
