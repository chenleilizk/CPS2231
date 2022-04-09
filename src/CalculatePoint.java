//Purpose: Calculate the middle point of two points.
public class CalculatePoint {

	public static void main(String[] args) {

	//step 1 :print the identification
	System.out.println("a       b      Middle Point");
	
	//step 2 :build the array
	int[] Al = new int[] {0,1,3,4};
	int[] Ar = new int[] {0,4,7,9,11};
	int[] Bl = new int[] {2,4,6,10,12};
	int[] Br = new int[] {1,2,3,5,7};
	
	//step 3 :display the table
	for(int i = 0; i <= 4; i++ ) {
		System.out.println("(" + Al[i] + ", " + Ar[i] + ")"+"  "
                +"(" + Bl[i] + ", " + Br[i] + ")"+"  "
                +"(" + (Al[i]+Bl[i])/2.0 + ", " + (Ar[i]+Br[i])/2.0 + ")");
	}

	}

}
