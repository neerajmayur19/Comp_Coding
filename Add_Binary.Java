class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        int carry = 0;
        int value;
        while(i>=0 && j>=0)
        {
            int num_1 = a.charAt(i) - '0';
            int num_2 = b.charAt(j) - '0';
            value = num_1 + num_2 + carry;
            sum = value%2;
            carry = value/2;
            result += Integer.toString(sum);
            i--;
            j--;
        }
        while(i>=0)
        {
            int num_1 = a.charAt(i) - '0';
            value = num_1 + carry;
            sum = value%2;
            carry = value/2;
            result += Integer.toString(sum);
            i--;
        }
        while(j>=0)
        {
            int num_2 = b.charAt(j) - '0';
            value = num_2 + carry;
            sum = value%2;
            carry = value/2;
            result += Integer.toString(sum);
            j--;
        }
        if(carry!=0)
        result += Integer.toString(carry);
        StringBuilder rev = new StringBuilder();
        rev.append(result);
        rev.reverse();
        String result1 = rev.toString();
        return result1;
    }
}
