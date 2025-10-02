package main.java.com.samarth.revision;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int total = 0;
        int left = 0;
        int right = height.length - 1;
        int rightMax = height[right];
        int leftMax = height[left];

        while (left < right) {
            total += ((rightMax - height[right]) + (leftMax - height[left]));
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left])
                    leftMax = height[left];
            }
            else {
                right--;
                if (rightMax < height[right])
                    rightMax = height[right];
            }
        }
        return total;
    }
}
