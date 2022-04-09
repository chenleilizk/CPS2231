package edu.wku.smallestposnum;

public class SmallestPosNum {
	public static int smallestPosNum(int[] nums) {
		int length = nums.length;
		int[] posNums = new int[length];
		int j = 0;
		for (int i = 0; i < length; i++) {
			if (nums[i] > 0) {
				posNums[j] = nums[i];
				j++;
			}
		}
		int temp = 0;
		int times = 0;
		int result = 0;
		for (int i = 0; i < posNums.length; i++) {
			temp = posNums[i];
			times = 0;
			for (int j1 = 0; j1 < posNums.length; j1++) {
				if (temp < posNums[j1])
					break;
				times++;
				if (times == posNums.length) {
					result = temp;
				}
			}
		}
		return result;
	}
}
