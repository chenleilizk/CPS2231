package edu.wku.calculatecost;

public class CalculateCost {
	public static int calculateCost(double[] unitTotalPrices) {
		int length = unitTotalPrices.length;
		double sum = 0;
		for (int i = 0; i < length; i++) {
			sum += unitTotalPrices[i];
		}
		if (sum >= 200 && sum < 360) {
			sum = sum * 0.95;
		} else if (sum >= 360 && sum < 520) {
			sum = sum * 0.9;
		} else if (sum >= 520) {
			sum = sum * 0.8;
		}
		int result = (int) sum;
		return result;
	}

}
