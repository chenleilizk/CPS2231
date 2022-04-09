//purpose:generate a random digit.
public class Main2 {

	public static void main(String[] args) {
		char ch = (char)((int)'0' + (int)(Math.random()*10                                                               ));
		System.out.println(ch);
	}

}
