import java.util.*;

//Purpose:Computer the area for circle with radius given by the user
public class ComputerArea2 {

	public static void main(String[] args) {
	//Main Idea : area = PI*r*r
		
	//step 1 : value for PI
	final double PI =3.14159;
    Scanner input = new Scanner(System.in);
    double radius=input.nextDouble();
    
    //step 2 : computer the area
    double area  =PI*radius*radius;
    
    //step 3 : show the result
    System.out.println("The area is "+area);
    
	}

}
