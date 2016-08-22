package Medium0728;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode d = head;
        int sum = 0;//sum of two nodes
        while (l1 != null || l2 != null){
            if(l1 != null){
                sum +=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            d.next = new ListNode(sum % 10);
            sum /= 10;//进位
            d = d.next;
        }
        if(sum == 1) d.next = new ListNode(1);//最后一位可能会产生进位
        return head.next;
        
    }
	class ListNode {
		     int val;
		     ListNode next;
		    ListNode(int x) {
		         val = x;
		         next = null;
		      }
		  }
	
}

