class Twitter {
    HashMap<Integer, HashSet<Integer>> friends;
    int current;
    PriorityQueue<int[]> timeline;
    public Twitter() {
        friends = new HashMap<>();
        current = 0;
        timeline = new PriorityQueue<>((a,b)->b[0]-a[0]);
    }
    
    public void postTweet(int userId, int tweetId) {
        timeline.add(new int[]{current++,userId,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<int[]> temp_ans = new PriorityQueue<>(timeline);
        int n = 0;
        while(!temp_ans.isEmpty() && n<10)
        {
            int[] value = temp_ans.poll();
            if(value[1]==userId || friends.getOrDefault(userId,new HashSet<>()).contains(value[1]))
            {
                answer.add(value[2]);
                n++;
            }
        }
        return answer;
    }
    
    public void follow(int followerId, int followeeId) {
        friends.computeIfAbsent(followerId,k-> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        friends.computeIfAbsent(followerId,k-> new HashSet<>()).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
