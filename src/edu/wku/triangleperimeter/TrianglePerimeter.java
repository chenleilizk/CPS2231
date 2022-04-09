package edu.wku.triangleperimeter;
import java.util.Scanner;
public class TrianglePerimeter {
	public static double computeTrianglePerimeter(double edge1,double edge2,double edge3) {
		if (edge3>=edge1+edge2&&edge1>=edge3+edge2&&edge2>=edge3+edge1) 
			return -1;
		else
			return (edge1+edge2+edge3);
	}
}
