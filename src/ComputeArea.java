//Purpose:Computer the area for circle with radius given
public class ComputeArea {

	public static void main(String[] args) {
			//Main Idea : area = PI*r*r
			
			//1.Value for r
			double radius = 2.5;
		
			//2.Value for PI
			double PI     = 3.14159;
			
			//3.Computer the area and save value to area
			double area   = PI*radius*radius;
			
			//4.Print out the area value
			System.out.println("The area for circle of radius :" 
			                   + radius +"is"+area);
					
					
	
	}

}
