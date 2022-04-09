import java.util.Scanner;
//purpose:Write a program to ask user to enter 10 numbers (integers), find and print out the largest 
//        number.
public class MaxNumber2 {

	public static void main(String[] args) {
		//step 1:get 10 integers from the user
				Scanner input = new Scanner(System.in);
				System.out.println("please enter 10 numbers : ");
				double [] nums = new double [10];
				
				//step 2:computer the Max.
				double max = nums[0];
				for(int i = 0;i<nums.length;i++) {
					nums [i] = input.nextDouble();
					if(max<nums[i]) {
						max = nums[i];
					}
				}
				 System.out.println("the largest number is " + max);

	}
}
