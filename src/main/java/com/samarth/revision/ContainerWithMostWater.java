package main.java.com.samarth.revision;

import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(area, max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
