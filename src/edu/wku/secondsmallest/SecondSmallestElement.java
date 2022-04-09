package edu.wku.secondsmallest;

import java.util.Scanner;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[][] nums) {
        if (nums.length == 0) return -1;
        int min = 0;
        int minX = 0, minY = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                n++;
                if (min > nums[i][j]) {
                    min = nums[i][j];
                    minX = i;
                    minY = j;
                }
            }
        }
        if (n == 1) return -1;
        nums[minX][minY] = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (min > nums[i][j]) {
                    min = nums[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int[][] nums = new int[x][y];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = input.nextInt();
            }
        }
        System.out.println(findSecondSmallest(nums));
    }
}
