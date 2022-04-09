//purpose:Write a simple program (using while loop) to simulate one complete cycle of Traffic Light. 
public class LightWhile {

	public static void main(String[] args) {
		
		//1.get the different from the user
		 
		System.out.println("Please enter the light : ");
	
		//2.show the result.
		int red = 0;
		while (red<5) {
			System.out.println("red light");
			red++;
		}
		int green = 0;
		while (green<3) {
			System.out.println("Green light");
			green++;
		}
		int yellow = 0;
		while (yellow<1) {
			System.out.println("Yellow light");
			yellow++;
		}
	   
	}

}
