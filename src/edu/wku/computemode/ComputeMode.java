package edu.wku.computemode;

public class ComputeMode {
	public static int mode(int[] nums) {
		int result = 0;
		boolean mark = true;
		if (nums.length == 0)
			result = -1;
		else {
			for (int i = 0; i < nums.length; i++) {
				mark = true;
				for (int j = 1; j <= nums[i]; j++) {
					if (nums[i] % j != 0)
						mark = false;
				}
				if (mark = true) {
					result = nums[i];
					break;
				}
			}
		}
		return result;
	}

}
