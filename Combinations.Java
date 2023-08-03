class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = i+1;
        }
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> final_ans = new ArrayList<>();
        combinations(0,arr,temp,final_ans,k);
        return final_ans;
    }
    public void combinations(int index,int[] arr, List<Integer> temp, List<List<Integer>> final_ans,int k)
    {
        if(temp.size()==k)
        {
            if(!(final_ans.contains(temp)))
            {
                final_ans.add(new ArrayList<>(temp));
            }
        }
        if(index<arr.length)
        {
        temp.add(arr[index]);
        combinations(index+1,arr,temp,final_ans,k);
        temp.remove(temp.size()-1);
        combinations(index+1,arr,temp,final_ans,k);
        }
    }
}
