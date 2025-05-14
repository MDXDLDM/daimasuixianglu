package pac;


public class removeElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode newhead=new ListNode(0,head);
        ListNode cur=newhead;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return newhead.next;
    }

}

