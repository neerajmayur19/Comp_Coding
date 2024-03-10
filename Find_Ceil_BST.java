class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int[] ceil = new int[1];
        ceil[0] = Integer.MAX_VALUE;
        findCeil(root,key,ceil);
        if(ceil[0]==Integer.MAX_VALUE)
        return -1;
        return ceil[0];
    }
    public void findCeil(Node root, int key, int[] ceil)
    {
        if(root==null)
        return;
        if(root != null)
        {
            if(root.data>=key)
            {
                ceil[0] = Math.min(ceil[0], root.data);
            }
            findCeil(root.left,key,ceil);
            findCeil(root.right,key,ceil);
        }
    }
}
