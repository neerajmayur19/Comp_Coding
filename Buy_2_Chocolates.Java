class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int value = prices[0] + prices[1];
        if(value>money)
            return money;
        else
            return money-value;
    }
}
