package pac;

public class removeN {
    public static ListNode removeNfromend(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode fast=newHead;
        ListNode slow=newHead;
        while(n>=0){
            fast=fast.next;
            n--;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return newHead.next;
    }
}
