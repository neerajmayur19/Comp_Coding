class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left_small = new int[heights.length];
        int[] right_small = new int[heights.length];
        Stack<Integer> index = new Stack<>();
        // This is to store index of the immediate element small to its left
        for(int i=0;i<heights.length;i++)
        {
            while((!(index.isEmpty())) && heights[index.peek()]>=heights[i])
            {
                index.pop();
            }
            if(index.isEmpty())
            {
                left_small[i] = 0;
            }
            else
            {
                left_small[i] = index.peek()+1;
            }
            index.push(i);
        }
        while(!(index.isEmpty()))
        {
            index.pop();
        }
        // This is to store the element small to its right
        for(int i=heights.length-1;i>=0;i--)
        {
            while((!(index.isEmpty())) && heights[index.peek()]>=heights[i])
            {
                index.pop();
            }
            if(index.isEmpty())
            {
                right_small[i] = heights.length-1;
            }
            else
            {
                right_small[i] = index.peek()-1;
            }
            index.push(i);
        }
        int max = 0;
        for(int i=0;i<heights.length;i++)
        {
            int value = (right_small[i] - left_small[i] + 1)*heights[i];
            max = Math.max(max,value);
        }
        return max;
    }
}
