//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b)->b.profit-a.profit);
        //System.out.println(arr[0].id);
        int[] answer = new int[2];
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxi = Math.max(maxi,arr[i].deadline);
        }
        int[] perform_last = new int[maxi];
        Arrays.fill(perform_last,-1);
        int no_of_jobs = 0;
        int max_profit = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(perform_last[arr[i].deadline-1]==-1)
            {
                perform_last[arr[i].deadline-1] = arr[i].id;
                no_of_jobs++;
                max_profit += arr[i].profit;
            }
            else
            {
                int index=arr[i].deadline-1;
                while(index>=0)
                {
                    if(perform_last[index]==-1)
                    {
                        perform_last[index] = arr[i].id;
                        no_of_jobs++;
                        max_profit += arr[i].profit;
                        break;
                    }
                    index--;
                }
            }
        }
        answer[0] = no_of_jobs;
        answer[1] = max_profit;
        return answer;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
