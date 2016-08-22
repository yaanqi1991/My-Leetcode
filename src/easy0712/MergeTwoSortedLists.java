package easy0712;

import java.awt.HeadlessException;

/*
 * 把2个sort好的linkedlist合并成一个sort好的linkedlist  类似 mergesort
 */
public class MergeTwoSortedLists {
	
	//递归
		public ListNode mergeTwoListsRec(ListNode l1, ListNode l2) {
			if(l1 == null) return l2;
			if(l2 == null) return l1;
			
			if(l1.val < l2.val){
				l1.next = mergeTwoListsRec(l1.next, l2);
				return l1;
			}else{
				l2.next = mergeTwoListsRec(l1, l2.next);
				return l2;
			}
		
	}
		//迭代
		public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
			if(l1 == null) return l2;
			if(l2 == null) return l1;
			
			ListNode beforeHead = new ListNode(0);
			ListNode temp = beforeHead;
			
			
			while(l1 != null && l2 !=null){
				if(l1.val <=l2.val){
					temp.next = l1;
					l1 = l1.next;
				}else{
					temp.next = l2;
					l2 = l2.next;
				}
				temp = temp.next;
			}
			if(l1 != null){
				temp.next = l1;
				
			}
			if(l2 != null){
				temp.next = l2;
				
			}
			return beforeHead.next;
			
		}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {
		val=x;
		next=null;
	}
}
