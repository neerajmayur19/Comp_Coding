class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    boolean[] visited = new boolean[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> st = new LinkedList<Integer>();
        int[] topo = new int[numCourses];
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(Integer a: graph.get(i))
            indegree[a]++;
        }
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            st.offer(i);
        }
        int k = numCourses-1;
        //Topological Sorting of Elements is done here
        while(!(st.isEmpty()))
        {
            int value = st.peek();
            topo[k] = st.poll();
            k--;
            for(Integer a: graph.get(value))
            {
                indegree[a]--;
                if(indegree[a]==0)
                st.offer(a);
            }
        }
        if(k==-1)
        return topo;
        return new int[0];
    }
}
