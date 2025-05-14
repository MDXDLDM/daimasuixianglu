package pac;

public class detectcycle {
    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        else{
            ListNode slow = head;
            ListNode fast = head;
            //int stepslow=0;
            //int sttepfast=0;
            while(fast!=null&&fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                //stepslow++
                if(slow == fast){
                    ListNode temp=slow;
                    slow=head;
                    while(slow!=temp){
                        slow=slow.next;
                        temp=temp.next;
                    }
                    return temp;
                }
            }
            return null;
        }
    }
}
