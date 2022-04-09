//purpose:Write a program that displays the following table.
public class Table {

	public static void main(String[] args) {
		 System.out.println("Celsius       Fahrenheit");
		 double farenheit;
		 for(int i=0;i<102;i+=2) {
		 System.out.print(i);
		 System.out.print("             ");
		 farenheit = i * 9/5 + 32; 
		 System.out.println(farenheit);
		 }
		  
	}

}
