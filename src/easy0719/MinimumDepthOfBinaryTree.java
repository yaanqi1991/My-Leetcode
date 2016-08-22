package easy0719;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
	       if(root==null){
	    	   return 0;
	       }
	       
	       int left= minDepth(root.left);
	       int right=minDepth(root.right);
//	       1
//	      /
//	     2  是两层高度  
	       if(left==0){
			   return right+1;
		   }
		   if(right==0){
			   return left+1;
		   }
	       return Math.min(left, right)+1;
	    }
}
