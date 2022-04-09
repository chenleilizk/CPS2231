package edu.wku.sumofstring;

public class SumOfString {
	public static int sumOfString(String orgText) {
		char[] text = new char[orgText.length()];
		text = orgText.toCharArray();
		int[] nums = new int[orgText.length()];
		int times = 0;
		int j = 0;
		for (int i = 0; i < orgText.length(); i++) {
			if (text[i] >= '0' && text[i] <= '9') {
				nums[j] = text[i] - '0';
				j++;
				times++;
			}
		}
		int sum = 0;
		if (times == 0) {
			sum = -1;
		} else {
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
		}
		return sum;
	}

}
