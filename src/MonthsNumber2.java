import java.util.Scanner;
//Purpose:Generate a random double numeric value with (0,12] and display the right month from the number
public class MonthsNumber2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//step 1: Generate one random
		int month =(int)(Math.random() * 13);
		
		//step 2: Show the result
		switch(month % 12) {
		case 0:
			System.out.println("January");
		break;
		case 1:
			System.out.println("February");
		break;
		case 2:
			System.out.println("March");
		break;
		case 3:
			System.out.println("April");
		break;
		case 4:
			System.out.println("May");
		break;
		case 5:
			System.out.println("June");
		break;
		case 6:
			System.out.println("July");
		break;
		case 7:
			System.out.println("August");
		break;
		case 8:
			System.out.println("September");
		break;
		case 9:
			System.out.println("October");
		break;
		case 10:
			System.out.println("November");
		break;
		case 11:
			System.out.println("December");
		break;
		
		}
		
	}
}