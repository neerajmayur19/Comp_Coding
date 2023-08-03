class Solution {
    public int maxArea(int[] height) {
        int tarea1,area1= 0;
        int n = height.length;
        int tarea = 0;
        int area = 0;
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            tarea = (Math.min(height[left],height[right])*(right-left));
            area = Math.max(tarea,area);
            if(height[left]<height[right])
            left++;
            else if(height[left]>height[right])
            right--;
            else
            {
                left++;
                right--;
            }
        }
        return Math.max(area1,area);
    }
   
}
