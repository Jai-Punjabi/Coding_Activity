class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max_water = 0;
        while (i < j) {
            int t = Math.min(height[i], height[j]) * (j - i);
            max_water = Math.max(max_water, t);
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return max_water;
    }
}
