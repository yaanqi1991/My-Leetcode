package easy0719;
/*
 * 去掉有序数组里的重复数字，返回新的数组长度
 * 2个指针快慢遍历，当fast扫到2个相邻的不一样时候 slow 才动 
 */
public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode cur = head;
		while(cur != null){
			while(cur.next != null && cur.val == cur.next.val){
				cur.next = cur.next.next;
			}
			cur = cur.next;
		}
		return head;
	}
}
 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	         val = x;
	          next = null;
	      }
	 }