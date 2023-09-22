import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] answer = new int[2];
        int temp;
      // This iteration is to find the missing number by making each value's index * -1 and if something is already negative, then it means it is visited already and that is the missing number
        for(int i=0;i<arr.size();i++)
        {
            temp = arr.get(i);
            if(temp < 0)
            {
                temp *= -1;
            }
            if(arr.get(temp-1)<0)
            {
                answer[1] = temp;
            }
            else
            {
                arr.set(temp-1,arr.get(temp-1)*-1);
            }
        }
      // This iteration is to find the missing number, we will traverse the original array and see which index's value is not marked negative and return i+1 as indices are marked from 1 to N.
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>0)
            {
                answer[0] = i+1;
            }
        }
        return answer;
    }
}
