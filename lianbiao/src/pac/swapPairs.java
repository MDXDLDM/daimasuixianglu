package pac;

public class swapPairs {
    public static ListNode swappairs(ListNode head){
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode cur = fakeHead;
        while(cur.next != null&&cur.next.next != null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next=cur.next.next;//此处与代码随想录不同，将步骤二三进行调换，避免了temp1的使用
            cur.next.next=temp;
            cur=temp;//简化等价于使用temp，不用再nextnext
        }
        return fakeHead.next;
    }
}
