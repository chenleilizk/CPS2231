 
import java.util.Scanner;
//Purpose:enter two integer and output the one that is larger
//Main idea:compare two numbers
public class ComputerTheLarger {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//step 1:print a and b
	int a=input.nextInt();
	
	int b=input.nextInt();	
	
	//step 2:show the bigger one
	if(a>b) {
	System.out.println("the bigger one is " + a );
	}
	else{//a<=b
	System.out.println("the bigger one is " + b );
	}
	}
	
	}

