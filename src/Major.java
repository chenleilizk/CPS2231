import java.util.Scanner;
//purpose:Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. 
public class Major {

	public static void main(String[] args) {
		//step 1:get two characters from the users
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters : ");
		String message = input.next();
		
		//step 2:judge the step3 going on or not.
		if(((message.charAt(0)!='I') &&(message.charAt(0)!='C')&&(message.charAt(0)!='A'))||((message.charAt(1)!='1')&&(message.charAt(1)!='2')&&(message.charAt(1)!='3') && (message.charAt(1)!='4'))){
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		//step 3:show the result
		if(message.charAt(0)=='I'){
			System.out.println("Information Manafement ");
			}
		else if(message.charAt(0)=='C'){
			System.out.println("Computer Science ");
			}
		else if(message.charAt(0)=='A'){
			System.out.println("Accounting ");
			}
		if(message.charAt(1)=='1'){
			System.out.print("Freshman");
			}
		else if(message.charAt(1)=='2'){
			System.out.print("the second year");
			}
		else if(message.charAt(1)=='3'){
			System.out.print("Junior");
			}
		else if(message.charAt(1)=='4'){
			System.out.print("Senior");			
			}
	}

}
