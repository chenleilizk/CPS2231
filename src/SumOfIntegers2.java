//purpose:find the sum of integers from 1 to 10,from 20 to 30, and from 35 to 45
public class SumOfIntegers2 {

	 public static int sum(int i1,int i2) {
		 int result=0;
		 for(int i =i1;i<=i2;i++)
			 result +=i;
		 return result;
	 }
	 public static void main(String[] args) {
		 System.out.println("sum from 1 to 10 is " + sum(1,10));
		 System.out.println("sum from 20 to 30 is " + sum(20,30));
		 System.out.println("sum from 35 to 45 is " + sum(35,45));
	 }
}