import java.util.Scanner;

//Purpose:reads the subtotal and the gratuity rate and computes the gratuity 

public class ComputeTheFee {

	public static void main(String[] args) {
//Main idea :The gratuity = the subtotal * the gratuity rate 
		final double subtotal =20;
		 
	    //step 1:print the rate
		Scanner input = new Scanner(System.in);
	    double rate= input.nextDouble();
	    
	    //step 2:compute the gratuity and total
	    double gratuity  =subtotal*rate;
	    double total     =subtotal*(1-rate);
	    
	    //step 3:show the result
	    System.out.println("The gratuity is"+gratuity);
	    System.out.println("The totalis" +total);
		        
		        
	}

}
