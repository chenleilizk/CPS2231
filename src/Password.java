//purpose:Generate a random password
public class Password {

	public static void main(String[] args) {
		//step 1:get five characters
		char ch1 = (char)((int)'A' + (int)(Math.random()*26));
		char ch2 = (char)((int)'a' + (int)(Math.random()*26));
		char ch3 = (char)((int)'0' + (int)(Math.random()*10));
		char ch4 = (char)((int)'A' + (int)(Math.random()*26));
		char ch5 = (char)((int)'0' + (int)(Math.random()*10));
		
		//step 2:show the result
		System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4 + ""+ ch5 );
	}

}
