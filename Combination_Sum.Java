class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> t = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        combinations(0,candidates,target,t,temp);
        return temp;
    }
    public void combinations(int index,int[] candidates,int target,List<Integer> t,List<List<Integer>> temp)
    {
        if(index==candidates.length)
        {
            if(target==0)
            temp.add(new ArrayList<>(t));
            return;
        }
        if(index<candidates.length && candidates[index]<=target)
        {
            t.add(candidates[index]);
            combinations(index,candidates,target-candidates[index],t,temp);
            t.remove(t.size()-1);
        }
        combinations(index+1,candidates,target,t,temp);
    }
}
