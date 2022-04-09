import java.util.Scanner;
//Purpose:read in investment amount, annual interest rate, and number of years and displays the future investment value 
public class ComputerValue {
//Main idea:futureValue=investmentAmout*Math.pow(1+annualInterestRate/12, years*12)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//step 1:print the investmentAmout,annualInterestRate and years
	    double investmentAmout=input.nextDouble();
	    double annualInterestRate=input.nextDouble();
	    double years=input.nextDouble();
	    
	    //step 2:computer the future value
	    double futureValue=investmentAmout*Math.pow(1+annualInterestRate/12, years*12);
	    
	    //step 3:show the result
	    System.out.println("The future value is"+futureValue);
	}
	}


