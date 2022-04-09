import java.util.Scanner;
//purpose:calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).
//Main idea : cost = w * 2.5 cost=w*4.5 cost=w*7.5 cost=w*10.5

public class ComputeCost {
	 
	public static void main(String[] args) {
	System.out.println("enter the weight");
	Scanner input = new Scanner(System.in);
	//step 1:get the weight from user
	double w= input.nextDouble();
	
	//step 2:show the fee
	if( 0<w&&w<=2) {
	System.out.println("the cost is "+2.5);	
	}
	else if ( 2<w&&w<=4 ) {
	System.out.println("the cost is "+4.5);
	}
	else if (4<w&&w<=10 ) {
	System.out.println("the cost is "+7.5);
	}
	else if (10<w&&w<=20) {
	System.out.println("the cost is "+10.5);
	}
	else {
	System.out.println("¡°the package cannot be \r\n"
			+ "shipped¡±");
	}
	}

}
