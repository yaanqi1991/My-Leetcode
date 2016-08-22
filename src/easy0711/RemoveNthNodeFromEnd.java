package easy0711;
/*
 * Given a linked list, remove the nth node from the end of list and return its head.
   For example,
   Given linked list: 1->2->3->4->5, and n = 2.
   After removing the second node from the end, the linked list becomes 1->2->3->5.
   
   ɾ����������n����
 * 
 */
public class RemoveNthNodeFromEnd {
	public ListNode removeNthNodeFromEnd(ListNode head,int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode p1 = pre;
		ListNode p2 = pre;
		int i = 0;
		while(i<n){//����p2�ƶ�n������
			p2 = p2.next;
			i++;
		}
		while(p2.next != null){
			//��p1��p2һ���ƶ���ֱ��p2�ƶ������һ����p1��p2֮�����n��
			//����p1���ǵ�����n���ڵ�
			p1 = p1.next;
			p2 = p2.next;
		}
		//ɾ��������n���ڵ㣬��p1ָ�����¸��ڵ�
		p1.next = p1.next.next;
		
		return pre.next;
	}
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
			next=null;
		}
	}
}
