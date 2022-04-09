//purpose:Use Math.Random() to generate 100 random double values (the range should be [0,100), then 
//        compute the average of these numbers and print out the result.
public class Randomnumbers {

	public static void main(String[] args) {
		//step 1:get 100 random double numbers.
		double [] nums = new double [100];
		double sum = 0;
		
		//step 2:computer the sum.
		for(int i = 0;i<100;i++) {
			 nums[i] = Math.random()*100;
		     sum+=nums[i]; 
		}
		
		//step 3:print the average.
		System.out.println ("the average is "+sum/100);
		
	}

}
