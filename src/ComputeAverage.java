import java.util.Scanner;

//Purpose:compute the average of three number given by user
public class ComputeAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//step 1:print the a b c
	    double a=input.nextDouble();
	    double b=input.nextDouble();
	    double c=input.nextDouble();
	    
	    //step 2:computer the average
	    double average=(a+b+c)/3.0;
	    
	    //step 3:show the result
	    System.out.println("The average is "+average);
	}

}
