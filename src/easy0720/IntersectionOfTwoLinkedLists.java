package easy0720;

public class IntersectionOfTwoLinkedLists {
	public static void main(String[] args) {
		
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		int lenA = length(headA);
		int lenB = length(headB);
		int diff = Math.abs(lenA-lenB);
		if(lenA > lenB){
			while (diff-- > 0) {
				headA = headA.next;
			}
		}else {
			while (diff-- >0) {
				headB = headB.next;
			}
		}
		for(;headA != null && headB != null;headA = headA.next,headB = headB.next){
			if(headA.equals(headB)) return headA;
		}
		return null;
	
	}
	private int length(ListNode list) {
		if(list == null) return 0;
		int length = 0;
		while (list != null) {
			length++;
			list = list.next;
		}
		return length;
	}

	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val =x;
			next = null;
		}
	}
}
