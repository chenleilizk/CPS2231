import java.util.Scanner;
//purpose:Write a program that prompts the user to enter the year and the first three letters of a month name .
public class MonthDays {

	public static void main(String[] args) {
		//step 1:get year and month from the users
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a year: ");
				int year = input.nextInt();
				System.out.print("Enter a month (first three letters with the first letter in uppercase): ");
				String month = input.next();
				
				//step 3:show the result
				if( month.equals("Jan")){
					System.out.println(month+year+" has 31 days.");
					}
				else if(month.equals( "Feb")){
					System.out.println(month+year+" has 28 days.");
					}
				else if(month.equals( "Mar")){
					System.out.println(month+year+" has 31 days.");
					}
				else if(month.equals( "Apr")){
					System.out.println(month+year+" has 30 days.");
					}
				else if(month.equals( "May")){
					System.out.println(month+year+" has 31 days.");
					}
				else if(month.equals( "June")){
					System.out.println(month+year+" has 30 days.");
					}
				else if(month.equals( "July")){
					System.out.println(month+year+" has 31 days.");
					}
				else if(month.equals( "Aug")){
					System.out.println(month+year+" has 31 days.");
					}
				else if(month.equals( "Sept") ){
					System.out.println(month+year+" has 30 days.");
					}
				else if(month.equals( "Oct")){
					System.out.println(month+year+" has 31 days.");
					}
				else if( month.equals( "Nove")){
					System.out.println(month+year+" has 30 days.");
		      		} 
				else if( month.equals( "Dec")){
					System.out.println(month+year+" has 31 days.");
					}
				else 
					System.out.println(month+" is not a correct month name ");
				 
			}

	}


