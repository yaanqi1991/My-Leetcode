package easy0719;


//左右子树高度相差不超过1
//a binary tree in which the depth of the two subtrees of every node never differ by more than 1
//每次recursive求左子树的高度和右子树的高度，（还记得高度怎么求么  叶子节点往下null返回0 然后叶子节点返回0+1 再上就返回1+1）
//但是如果左/右子树已经不平衡了 或者 两者高度相差大于1了 就返回-1
//然后就一层层网上返回-1 最后false
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
	      return maxDepth(root)!=-1;  
	    }
	 
	 private int maxDepth(TreeNode root){
		 if(root==null){
			 return 0;
		 }
	 
	 int left=maxDepth(root.left);
	 int right=maxDepth(root.right);
	 if(left==-1||right==-1||Math.abs(left-right)>1){
		 return -1;  //左右子树不平衡了 就 返回-1
	 }
	 
	 return Math.max(left,right)+1;
}
}
