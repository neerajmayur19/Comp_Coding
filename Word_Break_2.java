import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here
		ArrayList<String> answer = new ArrayList<>();
		StringBuilder temp = new StringBuilder("");
		findAnswers(0,temp,s,dictionary,answer);
		return answer;
	}
	public static void findAnswers(int index,StringBuilder temp,String s,ArrayList<String> dictionary, ArrayList<String> answer)
	{
		if(index==s.length())
		{
			// System.out.println(temp);
			if(!answer.contains(temp))
			answer.add(temp.toString().trim());
			// temp = new StringBuilder(" ");
		}
		if(index<s.length())
		{
			for(int i=index;i<=s.length();i++)
			{
				if(dictionary.contains(s.substring(index,i)))
				{
					int length = temp.length();
					temp.append(s.substring(index,i));
					temp.append(" ");
					findAnswers(i,temp,s,dictionary,answer);
					temp.setLength(length);
				}
			}
		}
	}
}
