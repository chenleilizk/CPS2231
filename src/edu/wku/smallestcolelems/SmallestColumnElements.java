package edu.wku.smallestcolelems;

public class SmallestColumnElements {
	public static double[] findSmallestColEles(double[][] matrix) {
		double[] ans = new double[matrix[0].length];
		for(int i=0;i<matrix[0].length;i++) {
			ans[i]=matrix[0][i];
			for(int j=0;j<matrix.length;j++) {
				if(matrix[j][i]<ans[i]) {
					ans[i]=matrix[j][i];
				}
			}
		}
		return ans;
	}
}
