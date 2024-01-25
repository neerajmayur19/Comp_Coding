class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(isLeaf(node)==false)
	    ans.add(node.data);
	    addLeftBoundary(node,ans);
	    addLeaves(node,ans);
	    addRightBoundary(node,ans);
	    return ans;
	}
	boolean isLeaf(Node node)
	{
	    if(node.left==null && node.right==null)
	    return true;
	    else
	    return false;
	}
	void addLeftBoundary(Node node, ArrayList<Integer> ans)
	{
	    Node current = node.left;
	    while(current != null)
	    {
    	    if(!(isLeaf(current)))
    	    {
    	        ans.add(current.data);
    	    }
    	    if(current.left != null)
    	    current = current.left;
    	    else
    	    current = current.right;
	    }
	}
	void addLeaves(Node node, ArrayList<Integer> ans)
	{
	    Node current = node;
	    if(current != null && isLeaf(current))
	    {
	        ans.add(current.data);
	        return;
	    }
	    if(current != null && current.left!=null)addLeaves(current.left,ans);
	    if(current != null && current.right!=null)addLeaves(current.right,ans);
	}
	void addRightBoundary(Node node, ArrayList<Integer> ans)
	{
	    Node current = node.right;
	    ArrayList<Integer> temp = new ArrayList<>();
	    while(current != null)
	    {
    	    if(!(isLeaf(current)))
    	    temp.add(current.data);
    	    if(current.right != null)
    	    current = current.right;
    	    else
    	    current = current.left;
	    }
	    for(int i=temp.size()-1;i>=0;i--)
	    {
	        ans.add(temp.get(i));
	    }
	}
}
