package edu.wku.arknights;

public class Arknights {
	public static boolean isSecure(int[] monsters) {
		boolean result = true;
		for (int i = 0; i < monsters.length; i++) {
			for (int j = 0; j < monsters.length; j++) {
				if (monsters[i] + monsters[j] == 0) {
					result = false;
				}
			}

		}
		return result;
	}

}
