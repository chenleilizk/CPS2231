//purpose:generate a random lowercase letter.
public class Main {

	public static void main(String[] args) {
		char ch = (char)((int)'a' + (int)(Math.random()*26));
		System.out.println(ch);
	}

}
