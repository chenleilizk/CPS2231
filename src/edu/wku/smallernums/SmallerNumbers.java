package edu.wku.smallernums;

public class SmallerNumbers {
    public static int findSmallerNums(int[][] nums) {
        if (nums.length == 0) return 0;
        double sum = 0;
        double average = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum = sum + nums[i][j];
                count++;
            }
        }
        average = sum / count;
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < average) {
                    count1++;
                }
            }
        }
        return count1;
    }
}
