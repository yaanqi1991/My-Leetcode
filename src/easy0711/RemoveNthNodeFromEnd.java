package easy0711;
/*
 * Given a linked list, remove the nth node from the end of list and return its head.
   For example,
   Given linked list: 1->2->3->4->5, and n = 2.
   After removing the second node from the end, the linked list becomes 1->2->3->5.
   
   删除链表倒数第n个数
 * 
 */
public class RemoveNthNodeFromEnd {
	public ListNode removeNthNodeFromEnd(ListNode head,int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode p1 = pre;
		ListNode p2 = pre;
		int i = 0;
		while(i<n){//先让p2移动n个距离
			p2 = p2.next;
			i++;
		}
		while(p2.next != null){
			//让p1和p2一起移动，直到p2移动到最后一个，p1和p2之间相差n个
			//所以p1就是倒数第n个节点
			p1 = p1.next;
			p2 = p2.next;
		}
		//删除倒数第n个节点，让p1指向下下个节点
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
