package com.github.alaahong;

/**
 * Created by ian.zhang on 2015/6/21.
 */
public class No03_2dArraySearch {
    public boolean search(int[][] matrix, int target) {
        boolean result = false;
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
            int width = 0;
            int height = matrix[0].length - 1;
            while (width < matrix.length && height >= 0) {
                if (matrix[width][height] == target) {
                    result = true;
                    break;
                } else if (matrix[width][height] > target) {
                    height--;
                } else {
                    width++;
                }
            }
        }
        return result;
    }
}
