//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] colors = new int[graph.length];
        return validGraph(0,graph,m,colors);
    }
    public boolean validGraph(int index, boolean[][] graph, int m, int[] colors)
    {
        if(index==graph.length)
        return true;
        for(int i=1;i<=m;i++)
        {
            if(possible(index,graph,i,colors))
            {
                colors[index] = i;
                if(validGraph(index+1,graph,m,colors))
                return true;
                else
                colors[index] = 0;
            }
        }
        return false;
    }
    public boolean possible(int index, boolean[][] graph, int c, int[] colors)
    {
        for(int i=0;i<graph.length;i++)
        {
            if(graph[index][i]==true && colors[i]==c)
            return false;
        }
        return true;
    }
}
