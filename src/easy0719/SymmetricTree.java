package easy0719;

import java.util.Stack;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class SymmetricTree {
	
	//ตÝน้
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
		
		return isSymmetric(root.left, root.right);
    }
	public boolean isSymmetric(TreeNode left,TreeNode right){
		if(left == null && right ==null) {
			return true;
		}else if (left != null && right != null) {
			return left.val == right.val && isSymmetric(left.left, right.right)&&isSymmetric(left.right, right.left);
		}else {
			return false;
		}
		
	}
	
	//stack
	public boolean isSymmetricByStack(TreeNode root) {
		if(root == null) return true;
		
		Stack<TreeNode> s = new Stack<>();
		s.push(root.left);
		s.push(root.right);
		while (!s.isEmpty()) {
			TreeNode n1 = s.pop();
			TreeNode n2 = s.pop();
			
			if(n1 == null && n2 == null) continue;
			if(n1 == null || n2 == null || n1.val != n2.val) return false;
			
			s.push(n1.left);
			s.push(n2.right);
			s.push(n1.right);
			s.push(n2.left);
		}
		return true;
		
	}
	
	


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		val = x;
	}
}
}
