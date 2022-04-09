//purpose:Write a simple program (using do-while loop) to simulate one complete cycle of Traffic Light.
public class LightDoWhile {

	public static void main(String[] args) {
		//1.get the different from the user
		 
			System.out.println("Please enter the light : ");
			
		//2.show the result.
			int red = 0;
			do {
				System.out.println("red light");
				red++;
			}while(red<5);
				
			int green = 0;
		    do {
				System.out.println("Green light");
				green++;
			}while(green<3);
				
			int yellow = 0;
			do {
				System.out.println("Yellow light");
			yellow++;
				}while(yellow<1);
			   
	}

}
