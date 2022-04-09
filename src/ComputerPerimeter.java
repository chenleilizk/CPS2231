import java.util.*;
//Purpose:Compute the perimeter of the circle.
public class ComputerPerimeter {

	public static void main(String[] args) {
		//Main Idea : Perimeter = PI*r*2
		
		//step 1:value the PI
		final double PI =3.14159;
	    Scanner input = new Scanner(System.in);
	    double radius=input.nextDouble();
	    
	    //step 2:computer the perimeter
	    double perimeter  =PI*radius*2;
	    
	    //step 3:show the result
	    System.out.println("The perimeter is"+perimeter);
	
	}

}
