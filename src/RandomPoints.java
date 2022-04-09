//purpose: Write a program that generates three random points on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle formed by these three points.
public class RandomPoints {

	public static void main(String[] args) {
		//step 1:generates three random points
		double point1=Math.random()*360;
		double point2=Math.random()*360;
		double point3=Math.random()*360;
		
	    //step 2:show the result
		System.out.println("Three random points are ");
		System.out.println("("+40*Math.sin(point1)+","+40*Math. cos(point1)+")");
		System.out.println("("+40*Math.sin(point2)+","+40*Math. cos(point2)+")");
		System.out.println("("+40*Math.sin(point3)+","+40*Math. cos(point3)+")");
		
	}
}
