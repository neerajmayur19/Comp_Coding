import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		for(int i=0;i<stack.size();i++)
		sort(stack);
		
	}
	public static void sort(Stack<Integer> stack)
	{
		if(stack.size()==0 || stack.size()==1)
		return;
		else
		{
			int value = stack.pop();
			sort(stack);
			if(stack.peek()>value)
			{
				int value1 = stack.pop();
				stack.push(value);
				stack.push(value1);
			}
			else
			{
				stack.push(value);
			}
		}
	}

}
