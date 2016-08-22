package easy0719;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null) {
			return false;
		}

		sum = sum - root.val;
		// 结束条件 当 到叶子节点时候sum==0
		if (root.left == null && root.right == null) {
			if (sum == 0) {
				return true;
			}
		}
     if(hasPathSum(root.left,sum)){return true;}
     if( hasPathSum(root.right, sum)){return true;}
     return false; 
	}
}
