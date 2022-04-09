//purpose:generate a random uppercase letter.
public class Main1 {

	public static void main(String[] args) {
		char ch = (char)((int)'A' + (int)(Math.random()*26));
		System.out.println(ch);
	}

}
