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
			int num = queue.size();// ��ǰ���whileѭ���е�current size
									// һ��ʼ��root��һ�� Ȼ��root
									// dequeue��ʱ���ѵڶ���ȫ�Ž�queue
									// Ȼ��ڶ���dequeue�Ĺ����л�ѵ����㶼�Ž�ȥqueue
									// ����ÿ��whileѭ���տ�ʼ��ʱ��queue��ֻ��һ��
									// ������Žв������
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
			
			//һ��������� ����forѭ����ı��� ����result
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
