//purpose:find the sum of integers from 1 to 10,from 20 to 30, and from 35 to 45
public class SumOfIntegers {

	public static void main(String[] args) {
		
		    int sum1 = 0;
			for(int i= 1;i<=10;i++)
				sum1 +=i;
			System.out.println("sum from 1 to 10 is " + sum1);
			
			int sum2 = 0;
			for(int i= 20;i<=30;i++)
				sum2 +=i;
			System.out.println("sum from 20 to 10 is " + sum2);
			
			int sum3 = 0;
			for(int i= 35;i<=45;i++)
				sum3 +=i;
			System.out.println("sum from 35 to 45 is " + sum3);
				
	}

}
