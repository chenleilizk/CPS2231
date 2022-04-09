import java.util.Scanner;
//Purpose:prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance.
public class ComputerDistant {
    //Main idea:diatant=Math.sqrt((x1+x2)*(x1+x2)+(y1+y2)*(y1+y2))
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		
		//step 1:print the x1 y1 x2 y2
	    double x1=input.nextDouble();
	    double y1=input.nextDouble();
	    double x2=input.nextDouble();
	    double y2=input.nextDouble();
	    
	    //step 2:computer the distant
	    double diatant=Math.sqrt((x1+x2)*(x1+x2)+(y1+y2)*(y1+y2));
	    
	    //step 3:show the result
	    System.out.println("The distant is"+Math.sqrt((x1+x2)*(x1+x2)+(y1+y2)*(y1+y2)) );
	}
	}


