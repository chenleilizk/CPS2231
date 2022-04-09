//purpose:computes the tuition in ten years and the total cost of four years¡¯ worth of tuition after the tenth year.
public class Tuition {

	public static void main(String[] args) {
		 int i=0;
		 double t=10000;
		 while(i<10){
			t=t*(1+0.06);
			i++;
		 }
		 System.out.println(t); 
		 i = 0;
		 double sum = 0;
		 while(i<4){
			 	sum+=t;
				t=t*(1+0.06);
				i++;
			 }
		 System.out.println(sum); 
	}
	

}
