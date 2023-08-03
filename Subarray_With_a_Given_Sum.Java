


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList<Integer> list = new ArrayList<>();
        int st=0, sum=0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            while(sum>s) {
                sum -= arr[st];
                st++;
            }
            if(sum==s && sum!=0) {
                list.add(st+1);
                list.add(i+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
