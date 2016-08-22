package easy0719;


//���������߶�������1
//a binary tree in which the depth of the two subtrees of every node never differ by more than 1
//ÿ��recursive���������ĸ߶Ⱥ��������ĸ߶ȣ������ǵø߶���ô��ô  Ҷ�ӽڵ�����null����0 Ȼ��Ҷ�ӽڵ㷵��0+1 ���Ͼͷ���1+1��
//���������/�������Ѿ���ƽ���� ���� ���߸߶�������1�� �ͷ���-1
//Ȼ���һ������Ϸ���-1 ���false
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
		 return -1;  //����������ƽ���� �� ����-1
	 }
	 
	 return Math.max(left,right)+1;
}
}
