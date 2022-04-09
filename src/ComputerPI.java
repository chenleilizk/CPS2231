//purpose:approximate p by using the following summation.
public class ComputerPI {

	public static void main(String[] args) {
		double sum=0;
		 for(int i=10000;i<=100000;i+=10000){
			 sum=0;
			 for(int j=1;j<=i;j++) {
				sum+= Math.pow(-1,j+1)/(2*j-1);
			 }
			 double pi=4*sum;
			 System.out.println("i :" +i +" The PI is "+ pi); 
		 }
		 
	}

}
