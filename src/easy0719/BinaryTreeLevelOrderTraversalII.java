package easy0719;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


//BFS
public class BinaryTreeLevelOrderTraversalII {
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) return result;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			int num = queue.size();
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
			
			//һ��������� ����forѭ����ı��� ����result��0λ��
			result.add(0,arrayList);//index at which the specified element is to be inserted
		}
		
		
		return result;
	}
	
}
