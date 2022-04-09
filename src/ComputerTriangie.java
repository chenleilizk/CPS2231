import java.util.Scanner;
//Purpose:read in the length of sides of an equilateral triangle
public class ComputerTriangie {
       //Main idea 1:area=Math.sqrt(3)/4*(length)*(length)
	   //Main idea 2:volume=area*length
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    //step 1:print the length
	    double length=input.nextDouble();
	    
	    //computer the area and volume
	    double area  =Math.sqrt(3)/4*(length)*(length);
	    double volume=area*length;
	    
	    //show the result
	    System.out.println("The area is"+area);
	    System.out.println("The volume" +volume);
		        
	}

}
