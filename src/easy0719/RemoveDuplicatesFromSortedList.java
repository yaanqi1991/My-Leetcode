package easy0719;
/*
 * ȥ��������������ظ����֣������µ����鳤��
 * 2��ָ�������������fastɨ��2�����ڵĲ�һ��ʱ�� slow �Ŷ� 
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