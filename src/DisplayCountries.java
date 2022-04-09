import java.util.Scanner;
//purpose:Write a program that prompts the user to enter three countries and displays them in descending order.
public class DisplayCountries {

	public static void main(String[] args) {
		//step 1: get three countries from the user
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the first country: ");
		String country1 = input.next();
		System.out.print(" Enter the  second country: ");
		String country2 = input.next();
		System.out.print(" Enter the third country: ");
		String country3 = input.next();
		
		//step 2:show the result
		if(country1.compareTo(country3)>0) {
			if(country3.compareTo(country2)>=0) 
				System.out.println("The three country in descending order are" +country2+" and "+country3+" " +country1);
			else if((country2.compareTo(country3)>0)&&(country1.compareTo(country2)>0)) 
				System.out.println("The three country in descending order are" +country3+" and "+country2+" " +country1);
			else 
				System.out.println("The three country in descending order are" +country3+" and "+country1+" " +country2);
		}
		if(country3.compareTo(country1)>0) {
			if(country1.compareTo(country2)>=0) 
					System.out.println("The three country in descending order are" +country2+" and "+country1+" " +country3);
			else if((country3.compareTo(country2)>0)&&(country2.compareTo(country1)>0)) 
					System.out.println("The three country in descending order are" +country1+" and "+country2+" " +country3);
			else 
					System.out.println("The three country in descending order are" +country1+" and "+country3+" " +country2);
		}		
		if(country1.compareTo(country3)==0) {
			if(country3.compareTo(country2)>0) 
					System.out.println("The three country in descending order are" +country2+" and "+country3+" " +country1);
		 					System.out.println("The three country in descending order are" +country3+" and "+country1+" " +country2);
			 
		}
	}
}