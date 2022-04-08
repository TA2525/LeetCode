class Solution {
    public int maxArea(int[] height) {
        int index1 = 0;
        int index2 = height.length - 1;
        
        int vol = -1;
        while (index1 < index2) {
            int width = index2 - index1;
            int tall = Math.min(height[index1],  height[index2]);
            
            if (width*tall > vol) {
                vol = width*tall;
            }
            
            if (height[index1] < height[index2]) index1 += 1;
            else if (height[index2] < height[index1]) index2 -= 1;
            else {
                index1 += 1;
                index2 -= 1;
            }
        }
        
        return vol;
    }
}