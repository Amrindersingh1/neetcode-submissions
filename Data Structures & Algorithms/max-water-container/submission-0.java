class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0;
        int j = heights.length-1;

        int ma = 0;

        while (i<j) {

            ma = Math.max(ma, area(heights,i , j));
            if(heights[i]<heights[j]) i++;
            else j--;

        }

        return ma;

    }

    public int area(int[] h, int i, int j) {
        return Math.min(h[i], h[j]) * (j-i);
    }
}
