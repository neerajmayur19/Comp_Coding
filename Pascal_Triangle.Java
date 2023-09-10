class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> f = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        f.add(temp);
        int i = 1;
        while(i<numRows)
        {
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            int j = 1;
            while(j<i)
            {
                int value = f.get(i-1).get(j-1) + f.get(i-1).get(j);
                temp1.add(value);
                j++;
            }
            temp1.add(1);
            f.add(temp1);
            i++;
        }
        return f;
    }
}
