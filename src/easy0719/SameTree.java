package easy0719;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
        	return true;
        }
        if(q==null||p==null){
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
		
    }
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		val = x;
	}
}