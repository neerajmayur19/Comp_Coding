

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                a.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(a);
        return a;
    }
}
