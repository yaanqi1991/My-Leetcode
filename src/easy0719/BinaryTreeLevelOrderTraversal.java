package easy0719;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class BinaryTreeLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) return result;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			int num = queue.size();// 当前这个while循环有的current size
									// 一开始是root第一层 然后root
									// dequeue的时候会把第二层全放进queue
									// 然后第二层dequeue的过程中会把第三层都放进去queue
									// 所以每个while循环刚开始的时候queue里只有一层
									// 所以这才叫层次优先
			for (int i = 0; i < num; i++) {
				TreeNode n = queue.poll();
				arrayList.add(n.val);
				if (n.left != null) {
					queue.add(n.left);
				}
				if (n.right != null) {
					queue.add(n.right);
				}
				}
			
			//一层遍历完了 把这for循环里的本层 加入result
			result.add(arrayList);
		}
		
		
		return result;
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
