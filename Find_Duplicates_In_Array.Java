

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int[] freq = new int[n];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[i]>1)
            {
                temp.add(i);
            }
        }
        boolean ans = temp.isEmpty();
        if(ans == true)
        {
            temp.add(-1);
            return temp;
        }
        else
        {
            return temp;
        }
    }
}
