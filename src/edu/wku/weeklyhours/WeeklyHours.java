package edu.wku.weeklyhours;

public class WeeklyHours {
    public static int[][] weeklyHours(int[][] matrix) {
        int[][] temp = new int[matrix.length][2];
        int[][] ans = new int[matrix.length][2];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            temp[i][0] = i;
            temp[i][1] = sum;
        }
        for (int i = 0; i < temp.length; i++) {
            int min = Integer.MAX_VALUE;
            int minX = 0;
            for (int j = 0; j < temp.length; j++) {
                if (min > temp[j][1]) {
                    min = temp[j][1];
                    minX = j;
                }
            }
            temp[minX][1] = Integer.MAX_VALUE;
            ans[i][0] = minX;
            ans[i][1] = min;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        int[][] results = weeklyHours(arr);
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j] + " ");
            }
            System.out.println();
        }
    }
}
