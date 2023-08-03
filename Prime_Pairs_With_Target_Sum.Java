class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] dp = new boolean[n+1];
        Arrays.fill(dp,true);
        dp = sieveOfEratosthenes(n);
        for(int i=2;i<=n/2;i++)
        {
            List<Integer> temp = new ArrayList<>();
            if(dp[i]==true && dp[n-i]==true)
            {
                temp.add(i);
                temp.add(n-i);
                ans.add(new ArrayList(temp));
            }
        }
        return ans;
    }
    public boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
}
